package assignment5;

/**
 *
 * @author Dayton Chevalier
 * This class implements a data type for storage and manipulation
 * of fractions
 * 
 */
public class Rational 
{
   private int numerator;
   private int denominator;

   //-------------------------------------------------------------------------
   // Default constructor - set fraction to 1/1
   public Rational(  )
   {
      numerator = 1;
      denominator = 1;
   }

   // Parameterized constructor - set fraction to user data
   public Rational( int n, int d )
   {
      numerator = n;
      denominator = d;
   }

   //-------------------------------------------------------------------------
   //  "get" method to access the fraction numerator
   //  Return: integer numerator

   public int getNumerator( )
   {
      return numerator;
   }

   //  "get" method to access the fraction denominator
   //  Return: integer denominator
   public int getDenominator( )
   {
      return denominator;
   }
   
   //-------------------------------------------------------------------------
   //  "set" method to change the fraction numerator
   //  Parameter: n numerator
   //  Return: none
   public void setNumerator( int n )
   {
      numerator = n;
   }

   //  "set" method to change the fraction denominator
   //  Parameter: d denominator
   //  Return: none
   public void setDenominator( int d )
   {
      denominator = d;
   }

   //-------------------------------------------------------------------------
   //  Calculates the decimal equivalent of a fraction
   //  Return: current numerator divided by denominator
   public double getDecimal( )
   {
      return (double) numerator / (double) denominator;
   }

   //-------------------------------------------------------------------------
   //  swaps the current numerator and denominator
   //  Return: none
   public void reciprocate( )
   {
     int temp = numerator;
     numerator = denominator;
     denominator = temp;
   }
   
   //-------------------------------------------------------------------------
   //  Reduce the current fraction by dividing numerator and denominator by GCD
   //  Return: none
   public void elevate(int factor )
   {
     numerator = numerator * factor;
     denominator = denominator * factor;
   }
   
   //-------------------------------------------------------------------------
   //  Reduce the current fraction by dividing numerator and denominator by GCD
   //  Return: none
   public void reduce( )
   {
     int divisor = gcd(numerator,denominator);
     numerator = numerator / divisor;
     denominator = denominator / divisor;
   }
   
   
   //-------------------------------------------------------------------------
   // Private utility function to return greatest common divisor for two integers
   // Necessary for reducing fractions
   private int gcd(int m, int n)
   {
       boolean done = false;
       int r;
       
       if (n  > m)                     // m  must be larger value
       {
          int temp = m;
          m = n;
          n = temp;
       }
         
       // Algorithm to calculate GCD      
       do
       {
          r  = m % n;
          if (r == 0)
            done = true;
          else
          {
            m  = n;
            n  = r;
          }
       } while ( r != 0 && ! done ); 
        
       return n;    // Variable n emerges are GCD
   }
}