//Original Package name, used in eclipse, may be removed for JGrasp finalization.
package com.chevalier64.decimalRounder;

//Imported Java libraries

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Class name, containing all class methods.
public class DecimalRounder {

   //Main class method that starts and ends the program. It is prepared to throw an IO exception if need be.
	public static void main(String args[])throws IOException
	{
		//Main initializes a new reader to take input from System.in
		InputStreamReader rawInput = new InputStreamReader(System.in);
		//Main then initializes a new buffer to buffer the input from System.in
		BufferedReader bufferedInput = new BufferedReader(rawInput);
		//Main initializes other used variable
		double castInput = 0.0;
		String contin = "yes";
		
		//Program then sets up loop to allow user to round numbers till content
		while (contin == "yes")
		{
			//Program asks user if they'd like to round.
			System.out.println("Would you like to round? Type yes to continue... ");
			contin = bufferedInput.readLine();
			//If user says yes, rounding begins
			if (contin == "yes")
			{
				//Program then requests a decimal number
				System.out.println("Please enter a decimal number for rounding: ");
				String givenLine = bufferedInput.readLine();
				
				//rawInput is worked on using a try catch statement
				try {
					//givenLine is first parsed from String into double.
					castInput = Double.parseDouble(givenLine);
					//castInput is then rounded and outputted to the console
					System.out.println("Rounded number is... " + Math.round(castInput));
					//Branch then ends restarting loop.
				}catch(Exception e){
					//If the data entered cannot be cast into a double, an error is given
					 System.err.println("That is not a roundable number: " + e.getMessage());
					//And branch ends restarting loop.
				}

			}
	
		}
		
		System.out.println("Have a nice day!");
	}
}
