/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayton Chevalier
 * Uses methods and modular programming to calculate loan interests.
 */
public class LoanFinder {

    /**
     * @param args the command line arguments
     */
      public static void main( String args[] )
   {
      int years = 0;
      double interest, principal = 0, monthly;
      boolean valid = false;

      
      while (valid == false)
      {   
          // Input Years 
          years = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Enter the length of the loan: (Less than 7 but more than 1)",
                  "Enter Loan Length.", JOptionPane.PLAIN_MESSAGE));

          //Validate input via method
          valid = validateYears(years);
          
          if (valid == false)
          {
              displayError();
          }
         
      }
      
      valid = false;
           
      while (valid == false)
      {
          // Input principal
          principal = Double.parseDouble(JOptionPane.showInputDialog(null, 
                  "Enter the principal amount: (No more than a million, but " +
                  "no less than 0)",
                  "Enter Principal Amount.", JOptionPane.PLAIN_MESSAGE));
      
                    //Validate input via method
          valid = validatePrincipal(principal);
          
          if (valid == false)
          {
              displayError();
          }
      }
      
      interest = interestRate(years);
      monthly = monthlyDues(years, principal, interest);
      outputFinal(monthly);
      
      System.exit( 0 );
         
   }  // end main

      
      
      
      
   //Validating input for years
    public static boolean validateYears(int years)
    {
        boolean result;
        
        if (years >= 2 && years <= 6)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    
    //validating input for principals
    public static boolean validatePrincipal(double principal)
    {
        boolean result;
        
        if (principal >= 0 && principal <= 1000000)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        
        return result;
    }
    
    //display error for false validation
    public static void displayError()
    {
    
        JOptionPane.showMessageDialog( null, "Invalid Input." +
                " Please input something else.", "Invalid", 
                JOptionPane.ERROR_MESSAGE);
    }
        
    //finding interest rate
    public static double interestRate(int years)
    {
        double result = 0;
        
        switch (years){
            case 2: result = .057;
                break;
            case 3: result = .062;
                break;
            case 4: result = .068;
                break;
            case 5: result = .075;
                break;
            case 6: result = .084;
                break;
        }
        return result;
    }
        
    public static double monthlyDues(int years,double principal,double interest)
    {
        double result;
        result = principal * ((interest/12) / (1-Math.pow(1+(interest/12),
                                                                -(years*12))));
        return result;
    }
    
    public static void outputFinal(double monthly)
    {
          
        // Set up for decimal formatting and write output
        DecimalFormat twoPlaces = new DecimalFormat( "0.00" );
        JOptionPane.showMessageDialog( null, "Your monthly payment is $"
                + twoPlaces.format(monthly) + " and your total dues will be $" +
                twoPlaces.format(monthly*12) + ".");
    }
}
