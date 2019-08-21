package assignment8;

/**
 *
 * @author Dayton Chevalier
 * This class defines the time, date, and location for
 * a campout.
 */
public class Campout
{
   GPSLocation place;
   TKdate date;
   Time startTime;

   // Parameterized onstructor to initialize date, time, and location
   public Campout(int month, int day, int year, int hours, int minutes,
            int seconds, double lad, double lon)
     {
             date = new TKdate(month, day, year);
             startTime = new Time(hours, minutes, seconds);
             place = new GPSLocation(lad, lon);
     }
   
   public String toString()
   {
       String str;
       str = "Date: " + date.toString() + " Time: " + startTime.toString() + place.toString();
       return str;
   }
   
} 
