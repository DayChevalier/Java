package assignment8;
import javax.swing.JOptionPane; 
/**
 *
 * @author Dayton Chevalier
 * This driver program instantiates an object of the Campout
 * class and writes the details
 */
public class CampoutDriver
{
   public static void main( String args[] )
   {
      // Create new event at 8/25/10 10am at Delta College
      Campout campEvent
         = new Campout( 8, 25, 2010, 10, 0, 0, 43.6, 84.0 );

      String output = campEvent.toString();
                      
      JOptionPane.showMessageDialog( null, output);

      System.exit( 0 );
   }
} 
