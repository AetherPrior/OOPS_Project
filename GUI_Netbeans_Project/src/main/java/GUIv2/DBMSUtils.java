import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class DBMSUtils
{
    private String username, password;
    MongoClient mc;
    MongoDatabase db;

    public DBMSUtils()
    {
        username = "varundb";
        password = "varsha123";
        try
        {
            MongoClientURI uri = new MongoClientURI(
    "mongodb+srv://varundb:"+password+"@cluster0-oi5zy.mongodb.net/test?retryWrites=true&w=majority");
            mc = MongoClients.create(uri); // Create database at localhost:27017
            db = mc.getDatabase("users");
        }
        catch(Exception e)
        {
            System.out.println("Failed to instantiate database");
        }
        
    }

    public boolean createNewUser(Customer c)
    {
        MongoCollection<Document> customers = db.getCollection("customers");
        Document cursor = customers.find(eq("name", c.username)).first();
        if(cursor == null)
        {
            Document entry = new Document("name", c.username)
                             .append("password", c.password)
                             .append("amount_in_wallet", c.w.money)
                             .append("location", c.loc)
                             .append("in_trip", false)
                             .append("trip_start", 0)
                             .append("trip_end", 0);
            customers.insertOne(entry);
            return true; 
        }
        else
        {
            return false;
        }
    }

    public boolean createNewUser(Driver d)
    {
        MongoCollection<Document> drivers = db.getCollection("drivers");
        Document cursor = drivers.find(eq("name", d.username)).first();
        if(cursor == null)
        {
            Document cust_details = new Document("name", d.assignedCustomer.username)
                                    .append("location", d.assignedCustomer.loc);

            Document entry = new Document("name", d.username)
                             .append("rating", d.rating)
                             .append("location", d.loc)
                             .append("in_trip", d.isInTrip);
                             .append("assigned_customer", cust_details);
            drivers.insertOne(entry);
            return true; 
        }
        else
        {
            return false;
        }
    }

    public boolean getTripStatus(String driverName)
    {
        MongoCollection<Document> drivers = db.getCollection("drivers");
        Document cursor = drivers.find(eq("name", driverName)).first();
        if(cursor == null)
        {
            return false;
        }
        else
        {
            return cursor.get("in_trip");
        }
    }

    public boolean getTripStatus(String customerName, boolean customer)
    {
        MongoCollection<Document> customers = db.getCollection("customers");
        Document cursor = customers.find(eq("name", customerName)).first();
        if(cursor == null)
        {
            return false;
        }
        else
        {
            return cursor.get("in_trip");
        }
    }

    public boolean endTrip(Driver d, double price)
    {
        if(d.isInTrip == true)
        {
            d.assignedCustomer.w.removeMoney(price);
            d.isInTrip = false;
            d.assignedCustomer.isInTrip = false;
            try
            {
                MongoCollection<Document> customers = db.getCollection("customers");
                Document cursor = customers.find(eq("name", d.assignedCustomer.username)).first();
                if(cursor == null)
                {
                    return false;
                }
                else
                {
                    customers.updateOne(eq("name", d.assignedCustomer.username), 
                                        combine(set("in_trip", false), 
                                        set("amount_in_wallet", d.assignedCustomer.w.money),
                                        set("trip_start", 0),
                                        set("trip_end", 0)));
                }
                MongoCollection<Document> drivers = db.getCollection("drivers");
                Document cursor = drivers.find(eq("name", d.username)).first();
                if(cursor == null)
                {
                    return false;
                }
                else
                {
                    drivers.updateOne(eq("name", d.username), set("in_trip", false));
                }
                d.assignedCustomer.assignedDriver = null;
                d.assignedCustomer = null;
                return true;
            }
            catch(Exception e)
            {
                System.out.println("Database not accessible : " + e);
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean startTrip(Driver d, double price, long trip_time)
    {
        if(d.isInTrip == false)
        {
            d.isInTrip = true;
            d.assignedCustomer.isInTrip = true;
            try
            {
                MongoCollection<Document> customers = db.getCollection("customers");
                Document cursor = customers.find(eq("name", d.assignedCustomer.username)).first();
                if(cursor == null)
                {
                    return false;
                }
                else
                {
                    long start = System.currentTimeMillis();
                    customers.updateOne(eq("name", d.assignedCustomer.username), 
                        combine(set("in_trip", true), set("trip_start", start),
                            set("trip_end", start+trip_time)));
                }
                MongoCollection<Document> drivers = db.getCollection("drivers");
                Document cursor = drivers.find(eq("name", d.username)).first();
                if(cursor == null)
                {
                    return false;
                }
                else
                {
                    drivers.updateOne(eq("name", d.username), set("in_trip", true));
                }
                return true;
            }
            catch(Exception e)
            {
                System.out.println("Database not accessible : " + e);
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public long getEndTime(Customer c)
    {
        try
        {
            MongoCollection<Document> customers = db.getCollection("customers");
            Document cursor = customers.find(eq("name", c.username)).first();
            if(cursor == null)
            {
                System.out.println("This guy doesn't exist in the DB");
                return -1;
            }
            else
            {
                return cursor.get("trip_end");
            }
        }
        catch(Exception e)
        {
            System.out.println("Database not accessible : " + e);
            return -1;
        }
    }

    public Customer loginUser(String username, String password)
    {
        try
        {
            MongoCollection<Document> customers = db.getCollection("customers");
            Document cursor = customers.find(and(eq("name", username), eq("password", password))).first();
            if(cursor == null)
            {
                return null;
            }
            else
            {
                Customer c = new Customer();
                c.username = username;
                c.password = password;
                c.w.money = cursor.get("amount_in_wallet");
                c.loc =  cursor.get("location");
                c.isInTrip = cursor.get("in_trip");
                return c;
            }
        }
        catch(Exception e)
        {
            System.out.println("Database not accessible : " + e);
            return null;
        }
    }
}