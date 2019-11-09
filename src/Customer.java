import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;

class Customer extends User implements Runnable,ActionListener
{
    String username;
    String password; //to be hashed 
    Wallet w;
    Location loc;
    boolean isInTrip, isLoggedIn;
    
    Customer()
    {

    }
    
    @Override void StoreInDB()
    {
        int a;
        //override it properly pls
    }

    @Override public void run()
    {
        //frontend , start a new window
        while(true)
        {
            if(quit)
                break;
        }
    }

    @Override public void actionPerformed(ActionEvent ae)
        {
            //All ActionEvent instances are passed to the respective listeners
            
            String op = ae.getActionCommand(); //the name added to the ActionEvent object

            if(op.equals("QUIT"))
                quit = true;
            //
            repaint(); //update the screen otherwise you don't see shit
        }

    public boolean journeyStatus(Object time)
    {
        // Typecast time object here
        Thread t = new Thread(this.username + "_trip_status");
        try
        {
            t.sleep(time.interval); // Change this later (maybe)
            return true;
        }
        catch(InterruptedException ie)
        {
            String messages[] = {"WASTED", "YOU DIED", "BUSTED", "HESITATION IS DEFEAT", "ALL WE HAD TO DO WAS FOLLOW THE DAMN TRAIN, CJ!"};
            Random rand = new Random();
            int n = rand.nextInt(5);
            System.out.println(messages[n]);
            return false;
        }
    }

}
