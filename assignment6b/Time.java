/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6b;
import java.text.DecimalFormat; 
/**
 *
 * @author Dayton Chevalier
 * Time class declaration to manage a time value
 * with hours-minutes-seconds on a 24-hour clock 
 */

public class Time 
{
   private int hour;     // 0 - 23
   private int minute;   // 0 - 59
   private int second;   // 0 - 59

   // Time constructor initializes each instance variable to zero;
   // ensures that Time object starts in a consistent state
   public Time() 
   { 
      this( 0, 0, 0 ); // invoke Time constructor with three arguments
   }

   // Time constructor: hour, minute and second supplied
   public Time( int h, int m, int s ) 
   { 
      setTime( h, m, s ); 
   }

   // Time constructor: another Time object supplied
   public Time( Time time )
   {
      // invoke Time constructor with three arguments
      this( time.getHour(), time.getMinute(), time.getSecond() );
   }

   // Set Methods
   // set a new time value using universal time; perform 
   // validity checks on data; set invalid values to zero
   public void setTime( int h, int m, int s )
   {
      setHour( h );   // set the hour
      setMinute( m ); // set the minute
      setSecond( s ); // set the second
   }
   
   // Set all variables to zero
   public void zeroTime()
   {
      setHour(0);
      setMinute(0);
      setSecond(0);
   }

   // validate and set hour 
   public void setHour( int h ) 
   { 
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
   }

   // validate and set minute 
   public void setMinute( int m ) 
   { 
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
   }

   // validate and set second 
   public void setSecond( int s ) 
   { 
      second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   }

   // Get Methods
   // get hour value
   public int getHour() 
   { 
      return hour; 
   }

   // get minute value
   public int getMinute() 
   { 
      return minute; 
   }

   // get second value
   public int getSecond() 
   { 
      return second; 
   }

   // convert to String in universal-time format
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return twoDigits.format( getHour() ) + ":" +
         twoDigits.format( getMinute() ) + ":" +
         twoDigits.format( getSecond() );
   }

   // convert to String in standard-time format
   public String toStandardString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return ( ( getHour() == 12 || getHour() == 0 ) ? 
         12 : getHour() % 12 ) + ":" + twoDigits.format( getMinute() ) +
         ":" + twoDigits.format( getSecond() ) + 
         ( getHour() < 12 ? " AM" : " PM" );
   }

} // end class Time 