class Driver extends User implements Runnable,ActionListener
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
}