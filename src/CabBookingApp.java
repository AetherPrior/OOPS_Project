
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

public class CabBookingApp implements ActionListener
{
	public static void main(String args[])
	{
		//frontend goes here

	}	
	@Override public void actionPerformed(ActionEvent ae)
		{

			
			//All ActionEvent instances are passed to the respective listeners
			String s1, s2, hashedString;
			int r;

			s1 = username.getText();
			s2 = password.getText();

			//DBMS code goes here,retrieve the HASH			

			String op = ae.getActionCommand(); //the name added to the ActionEvent object

			if(op.equals("LOGIN"))
			{

				//IF username not in DB
				//Frontend prompt to create a new user 
				// if yes 
				Customer c;// load object from file/DB
				FileOutputStream fos("path/to/db");
				if(s2 == hashedString)
				{
					
					//load stuff
					c = fos.read();
					fos.close(); //or whatever 
					c.start(); //start a thread
				}
			}
			
			repaint(); //update the screen otherwise you don't see shit
		}
}