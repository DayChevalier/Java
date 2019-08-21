package assignment8b;

/**
 *
 * @author Dayton Chevalier
 * This class defines the attributes for a preferred customer. It
 * also redefines the method for calculating their discount on purchases
 */
public class PreferredCustomer extends Customer
{
    int years;
    
   
   // constructor to initialize name, birth date and hire date
   public PreferredCustomer( String nam, String ph,
                             int n, double sp, int yrs )
   {
      super(nam,ph,n,sp);
      years = yrs;
   }
   
   public double getRefund()
   {
       double refund = 0;
       if (annualSpending <= 400)
           refund = annualSpending * .03;
       else if (annualSpending > 400 && annualSpending <= 800)
           refund = annualSpending * .04;
       else if (annualSpending > 800 && annualSpending <= 1000)
           refund = annualSpending * .05;
       else if (annualSpending > 1000)
           refund = annualSpending * .06;
       return refund;
   }

   public String toString()
   {
       String str;
       str = "Name: " + super.name + "\n" + " Phone: " + super.phone
               + " Member Number: " + super.memberNum + "\n" 
               + " Annual Spending: $" + super.annualSpending + " Refund: $"
               + getRefund() + "\n" + " Years a Member: " + years;
       return str;
   }
}  