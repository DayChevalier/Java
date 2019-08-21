package assignment8b;

/**
 *
 * @author Dayton Chevalier
 * This class defines the attributes for a person including
 * name and address 
 */

public class Person
{
   protected String name;
   protected String phone;

   // constructor to initialize name, birth date and hire date
   public Person( String n, String ph )
   {
      name = n;
      phone = ph;
   }

   // convert Employee to String format
   public String toString()
   {
      return "Name: "  + name + "\n" +
           "  Phone: " + phone;
   }
}  