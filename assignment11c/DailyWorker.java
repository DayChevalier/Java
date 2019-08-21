/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11c;

/**
 *
 * @author Dayton Chevalier
 */
public final class DailyWorker extends Employee 
{
   private double wage;   // wage per day
   private int days;  // days worked per week

   // Constructor for class DailyWorker
   public DailyWorker( String first, String last, 
                        double w, int d )
   {
      super( first, last );   // call superclass constructor
      setWage( w );
      setDays( d );
   }
   
   // Set the wage - with error checking
   public void setWage( double w )
   { 
      wage = ( w > 0 ? w : 0 ); 
   }
   
   // Set the hours worked - with error checking
   public void setDays( int d )
   {
      days = ( d >= 0 && d < 8 ? d : 0 ); 
   }
   
   // Get the HourlyWorker's pay
   public double earnings() 
   { 
      if (days > 3)
      {
          return 100 + (wage * days);
      }
      else
          return wage*days;
   }
   
   // Object status returned as String object
   public String toString() 
   {
      return "Daily worker: " + super.toString();
   }
} 