package assignment11c;

/**
 *
 * @author Dayton Chevalier
 * Abstract base class Employee
 * All classes inheriting from this class MUST implement
 * the abstract 'earnings' method 
 */
public abstract class Employee 
{
   private String firstName;
   private String lastName;

   // Constructor
   public Employee( String first, String last )
   {
      firstName = first;
      lastName = last;
   }
   
   // Return the first name
   public String getFirstName() 
   { 
      return firstName; 
   }

   // Return the last name
   public String getLastName() 
   { 
      return lastName; 
   }

   // Object status returned as String object
   public String toString()
   { 
      return firstName + ' ' + lastName; 
   }

   // Abstract method that must be implemented for each 
   // derived class of Employee from which objects 
   // are instantiated.
   public abstract double earnings(); 

} 
