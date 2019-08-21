package assignment8b;
import javax.swing.JOptionPane; 
/**
 *
 * @author Dayton Chevalier
 * This driver program instantiates objects of the customer class and
 * calculates their price discount. 
 */
public class CustomerTest 
{
   public static void main( String args[] )
   {
      Customer cust1 
         = new Customer( "Tim", "555-1234", 9876, 121.55 );
      Customer cust2 
         = new Customer( "Jen", "867-5309", 2345, 673.66 );
      PreferredCustomer cust3 
         = new PreferredCustomer( "Josh",  "999-6543", 1129, 1599.45, 10 );

      String output = cust1.toString() +
                      cust2.toString() +
                      cust3.toString();
                      
      JOptionPane.showMessageDialog( null, output);

      System.exit( 0 );
   }
}  
