/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Dayton Chevalier
 * This program finds bank fees
 */
// This application receives a number of checks written by
// a bank customer and calculates the monthly service charge.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class BankCharge
{
   public static void main( String args[] )
   {
      int    numChecks;   // Input value  - checks written
      double bankCharge;  // Output value - bank charges
      int chargingTotal;  // Temp value - checks charged
      
      // Set up for monetary decimal formatting
      DecimalFormat twoDigits = new DecimalFormat( "0.00" );
      
      // Read number of checks from user, convert to integer
      numChecks  = Integer.parseInt(
              JOptionPane.showInputDialog( "Enter number of checks" ));

      // Calculate the total bank charge
      bankCharge = 15;
      
      if (numChecks >= 0)
      {
          if (numChecks >= 30)
          {
              if (numChecks >= 50)
              {
                  if (numChecks >= 75)
                  {
                      chargingTotal = numChecks - 74;
                      bankCharge = bankCharge + chargingTotal * .06;
                      numChecks = numChecks - chargingTotal;
                  }
                  chargingTotal = numChecks - 49;
                  bankCharge = bankCharge + chargingTotal * .08;
                  numChecks = numChecks - chargingTotal;
              }
              chargingTotal = numChecks - 29;
              bankCharge = bankCharge + chargingTotal * .10;
              numChecks = numChecks - chargingTotal;
          }
          bankCharge = bankCharge + numChecks * .12;
      }
      
  
     // Display results
      JOptionPane.showMessageDialog ( null, "Monthly bank charge: $"
                                      + twoDigits.format(bankCharge));

      System.exit( 0 );
   }
} 