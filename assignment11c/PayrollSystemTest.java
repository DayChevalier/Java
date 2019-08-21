package assignment11c;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Dayton Chevalier
 * Driver for Employee hierarchy - Calculate earnings for employees
 * of a variety of job classifications 
 */
public class PayrollSystemTest
{
   private final static int NUM_EMPLOYEES = 6;

   public static void main( String args[] )
   {
      Employee employeeList[] = new Employee[NUM_EMPLOYEES]; 
      String output = "";

      employeeList[0]  = new Boss( "John", "Smith", 800.00 );
      employeeList[1]  = new CommissionWorker( "Sue", "Jones", 400.0, 3.0, 150);
      employeeList[2]  = new PieceWorker( "Bob", "Lewis", 2.5, 200 );
      employeeList[3]  = new HourlyWorker( "Karen", "Price", 13.75, 40 );
      employeeList[4]  = new SalariedWorker( "Jane", "Doe", 2512.56 );
      employeeList[5]  = new DailyWorker( "Jim", "dean", 90, 5);

      DecimalFormat precision2 = new DecimalFormat( "0.00" );

      for (int i = 0; i < NUM_EMPLOYEES; i++)
      {
         output += employeeList[i].toString() + " earned $" +
                   precision2.format( employeeList[i].earnings() ) + "\n";
      }

      JOptionPane.showMessageDialog( null, output,
         "Demonstrating Polymorphism",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
} 
