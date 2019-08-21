/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Dayton Chevalier
 *  This application converts a coded geographic location in
 * degrees-minutes-seconds to a decimal degrees value.
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class degreeConvert
{
   public static void main( String args[] )
   {
      String dmsString;
      int dms, degrees, minutes, seconds;
      double result;

      // Read coded location as one integer
      dmsString = JOptionPane.showInputDialog( "Enter location value as (ddmmss):" );

      // Decode and extract integers
      dms          = Integer.parseInt( dmsString );
      seconds      = dms % 100;
      int leftover = dms / 100;
      minutes      = leftover % 100;
      degrees      = leftover / 100;
      
      // Build output message with conversion
      result = convert(degrees, minutes, seconds);
         
      // Set up for decimal formatting and write output
      DecimalFormat threePlaces = new DecimalFormat( "0.000" );
      JOptionPane.showMessageDialog( null, "Location: "
          + threePlaces.format(result) + " degrees" );

      System.exit( 0 );
         
   }  // end main

    public static double convert(int degrees, int minutes, int seconds)
    {
        double result;
        
        minutes = minutes + ((seconds * 100) / 60);
        result = degrees + ((minutes * 100) / 60);
        
        return result;
    }

} // end application 