package assignment8b;
import java.text.DecimalFormat; 
/**
 *
 * @author Dayton Chevalier
 * This class defines the attributes for a customer. It also
 * defines the method for calculating their discount on purchases 
 */
public class Customer extends Person
{
   protected int     memberNum;
   protected double  annualSpending;

   // Constructor to initialize name, member number and spending amount
   public Customer( String nam, String ph, int n, double sp )
   {
       super(nam,ph);
       memberNum = n;
       annualSpending = sp;
   }

   // Return calculated price discount to user.  All general
   // customers received 2% of the annual purchases back to them.
   public double getRefund()
   {
       return annualSpending * 0.02;
   }

   // Convert Customer to String format
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat("0.00");
   
      return super.toString() +
          "  Member Number: "   + memberNum + "\n" +
          "  Annual Spending: $" +
          twoDigits.format(annualSpending) +
          "  Refund: $"   
          + twoDigits.format(getRefund()) + "\n";
   }

}  