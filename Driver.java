class Driver extends User
{
    double rating;
    Location loc;
    boolean isInTrip;
    Customer assignedCustomer;
    Driver()
    {
        rating = 3.0;
        isInTrip = false;
        assignedCustomer = null;
    }
    public boolean AssignCustomer(Customer c1)
    {
        if(!isInTrip)
        {
            assignedCustomer = c1;
            isInTrip = c1.isInTrip = true;
            return true;
        }
        return false;
    } 
    @Override void StoreInDB()
    {
        int a;
        //override it properly pls
    }
}