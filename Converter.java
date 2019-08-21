//Original Package name, used in eclipse, may be removed for JGrasp finalization.
package com.chevalier64.converter;

import javax.swing.JOptionPane;

//Imported Java libraries



//Class name, containing all class methods.
public class Converter {
	
	//Constant created for Earth's gravitational effect on mass.
	public static final double EARTH = 2.2; 
	
	//Main class method that starts and ends the program.
	public static void main(String args[])
	{
		//Main initializes used variable
		String input = "0.00";
		int userAnswer = JOptionPane.YES_OPTION;	
		Double mass = 0.00;
		Double weight = 0.00;

		
		//Program then sets up loop to allow user to round numbers till content
		while (userAnswer == JOptionPane.YES_OPTION)
		{
			//Program asks user if they'd like to convert via a dialog box.
			userAnswer = JOptionPane.showConfirmDialog(null, "Would you like to convert from Mass (Kg) to Pounds (Lbs)?", "Converter", JOptionPane.YES_NO_OPTION);

			//If user says yes, converting begins
			if (userAnswer == JOptionPane.YES_OPTION)
			{
				
				//Main takes mass data in kilograms through Dialog box
				input =JOptionPane.showInputDialog("Please input a mass in kilograms for conversion.");					
				
				//input is worked on using a try catch statement
				try {
					//input parsed from String into double.
					mass = Double.parseDouble(input);
					//mass multiplied by constant to find weight
					weight = mass*EARTH;
					//mass and weight are formated into unique String form
					String massFormat = String.format("%.2f",mass);
					String weightFormat = String.format("%.2f",weight);				
					//massFormat and weightFormat are output through Dialog box
					JOptionPane.showMessageDialog(null, "Mass: " + massFormat + "kg" + "\n" + "Weight: " + weightFormat + "lbs");
					//Branch then ends restarting loop.
				}catch(Exception e){
					//If the data entered cannot be cast into a double, an error is given
					//custom title, custom icon
					JOptionPane.showMessageDialog(null,"Entered Data could not be converted.","Conversion Error",JOptionPane.ERROR_MESSAGE);
					//And branch ends restarting loop.
				}

			}
			
		}
				
		JOptionPane.showMessageDialog(null,"Good Bye!","Converter",JOptionPane.WARNING_MESSAGE);
	}
}
