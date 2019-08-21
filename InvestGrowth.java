/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Dayton Chevalier
 * An investment program that uses loops
 */
// This application performs a simple analysis on an growing investment
 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;    

public class InvestGrowth
{
   public static void main( String args[] )
   {
      double answer1;
      int answer2;

      DecimalFormat twoDigits = new DecimalFormat( "0.00" );
  
      // Assuming an investment of $1000 at 5% per month, this
      // loop calculates the value of the investment after 5 years

      int month;
      for (month = 0, answer1 = 1000; month <= 60; month++)
      {
          answer1 = answer1 + (answer1 * .045);
      }          

      // Assuming an investment of $1000 at 5% per month, this
      // loop calculates how long it will take until the investment
      // reaches $1 million.

     double amount = 1000;
     answer2 = 0;
     while (amount <= 1000000)
     {
         amount = amount + (amount * .045);
         answer2++;
     }

      JOptionPane.showMessageDialog(null, 
            "$1000 compounding a 5% per month is valued at $" +
            twoDigits.format(answer1) + "\n" +
            "It takes " + answer2 + " months to reach $1 million");
            
      System.exit(0);

   }  // end main
   
}  // end class BactGrowth 