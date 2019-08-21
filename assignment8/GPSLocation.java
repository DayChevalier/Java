package assignment8;

/**
 *
 * @author Dayton Chevalier
 * Definition of class to store 
 * one city location and airport code 
 */

public class GPSLocation
{
   private double latitude;    // degrees
   private double longitude;   // degrees

   // Default constructor
   public GPSLocation()
   {
      latitude = 0.0;
      longitude = 0.0;
   }

   // Parameterized constructor
   public GPSLocation(double lat, double lon)
   {
      latitude = lat;
      longitude = lon;
   }

   // "get/set" methods
   public double getLat()
   {  return latitude;  }
   public double getLon()
   {  return longitude;  }
       
   public String toString()
   {
      return " Latitude:  " + latitude  +
             " Longitude: " + longitude + "\n";
   }

}  // end class GPSLocation 
