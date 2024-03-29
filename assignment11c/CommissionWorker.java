package assignment11c;

/**
 *
 * @author Dayton Chevalier
 * CommissionWorker class derived from Employee
 */
public final class CommissionWorker extends Employee 
{
   private double salary;      // base salary per week
   private double commission;  // amount per item sold
   private int quantity;       // total items sold for week

   // Constructor for class CommissionWorker
   public CommissionWorker( String first, String last,
                            double s, double c, int q)
   {
      super( first, last );  // call superclass constructor
      setSalary( s );
      setCommission( c );
      setQuantity( q );
   }
   
   // Set CommissionWorker's weekly base salary - with error checking
   public void setSalary( double s )
   { 
      salary = ( s > 0 ? s : 0 ); 
   }
   
   // Set CommissionWorker's commission - with error checking
   public void setCommission( double c ) 
   {
      commission = ( c > 0 ? c : 0 );
   }
   
   // Set CommissionWorker's quantity sold - with error checking
   public void setQuantity( int q )
   {
      quantity = ( q > 0 ? q : 0 ); 
   }
   
   // Determine CommissionWorker's earnings
   public double earnings()
   { 
      return salary + commission * quantity; 
   }
   
   // Object status returned as String object
   public String toString() 
   {
      return "Commission worker: " + super.toString();
   }
}    
