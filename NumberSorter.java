
//Original Package name, used in eclipse, may be removed for JGrasp finalization.
package com.chevalier64.numberSorter;
//Imported Java libraries
import javax.swing.JOptionPane;

//Class name, containing all class methods.
public class NumberSorter {
	
	//Main class method that starts and ends the program.
	public static void main(String args[])
	{
		//Main initializes used variable
        int x = 1;
        int y = 2;
        int z = 3;
		int confirm = JOptionPane.YES_OPTION;	
		String input1 = "1";
		String input2 = "2";
		String input3 = "3";

		
		//Program then sets up loop to allow user to round numbers till content
		while (confirm == JOptionPane.YES_OPTION)
		{
			//Program asks user if they'd like to sort via a dialog box.
			confirm = JOptionPane.showConfirmDialog(null, "Would you like to sort some numbers?", "Number Sort", JOptionPane.YES_NO_OPTION);

			//If user says yes, sorting begins
			if (confirm == JOptionPane.YES_OPTION)
			{
				
				//Main takes three numbers in a user chosen order
				input1 =JOptionPane.showInputDialog("Please input first number.");
				input2 =JOptionPane.showInputDialog("Please input second number.");
				input3 =JOptionPane.showInputDialog("Please input third number.");
				
				//input is worked on using a try catch statement
				try {
					//input parsed from String into int.
					x = Integer.parseInt(input1);
					y = Integer.parseInt(input2);
					z = Integer.parseInt(input3);
					
					//numbers are compared and sorted one by one.
		            //sorted numbers are then output through Dialog box
			        if (x <= y) 
			        {
			        	if (y < z){
			        		JOptionPane.showMessageDialog(null, "The sorted order is: "+ x + ", " + y + ", " + z + ".");
			        	} else {
			        		JOptionPane.showMessageDialog(null, "The sorted order is: "+ x + ", " + z + ", " + y + ".");
			        	}
			           
			        }else if (x <= z)
			        {
			            JOptionPane.showMessageDialog(null, "The sorted order is: "+ y + ", " + x + ", " + z + ".");
			        } else {
			            if (y < z)
			            {
			            	JOptionPane.showMessageDialog(null, "The sorted order is: "+ y + ", " + z + ", " + x + ".");
			            }else {
			            	JOptionPane.showMessageDialog(null, "The sorted order is: "+ z + ", " + y + ", " + x + ".");
			            }
			        }
			        //Branch then ends restarting loop.
				}catch(Exception e){
					//If the data entered cannot be cast into a integer, an error is given
					JOptionPane.showMessageDialog(null,"Entered Data could not be sorted.","Sorting Error",JOptionPane.ERROR_MESSAGE);
					//And branch ends restarting loop.
				}

			}
			
		}
				
		JOptionPane.showMessageDialog(null,"Good Bye!","Number Sort",JOptionPane.WARNING_MESSAGE);
	}
}





