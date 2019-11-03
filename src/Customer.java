import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Customer extends User implements Runnable,ActionListener
{
    String username;
    String password; //to be hashed 
    Wallet w;
    Location loc;
    boolean isInTrip;
    
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

}
