package assignment11c;

/**
 *
 * @author Dayton Chevalier
 * Boss class derived from Employee
 */
public final class Boss extends Employee 
{
   private double weeklySalary; 

   // Constructor for class Boss
   public Boss( String first, String last, double s)
   {
      super( first, last );  // call superclass constructor
      setWeeklySalary( s );
   }
   
   // Set the Boss's salary - with error checking
   public void setWeeklySalary( double s )
   {
      weeklySalary = ( s > 0 ? s : 0 ); 
   }
   
   // Get the Boss's pay - with error checking
   public double earnings()
   { 
      return weeklySalary; 
   }
   
   // Object status returned as String object
   public String toString() 
   {
      return "Boss: " + super.toString();
   }
} 
