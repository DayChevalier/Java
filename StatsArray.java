/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 *
 * @author Dayton Chevalier
 * This application demonstrates the functionality of methods that receive
 * an integer array and return various statistical parameters.  Output
 * is written to the console. 
 */
public class StatsArray extends JFrame
{
   // Declare and allocate array elements for test
   int statData[] = {99,76,82,86,85,91,71,66,58,45,94,85,71};
   
   JTextArea outputArea;   // Text area for multi-line output
   String output;          // For accumulating output info

   public StatsArray()
   {
       // Get access to JFrame container - set for FlowLayout      
       Container frameContainer = getContentPane();
       frameContainer.setLayout( new FlowLayout() );
       
       // Add a text area to the app and enable it to be viewed
       outputArea = new JTextArea();
       frameContainer.add(outputArea);
       
       output = new String();    // Instantiate String object
   
       // Add statistical summary data to output text       
       output += "Average: " + average(statData)  + "\n"
              +  "Maximum: " + maximum(statData)  + "\n"
              +  "Minimum: " + minimum(statData)  + "\n"
              +  "Median:  " + median(statData)   + "\n";
              
       // Set text to applet display area
       outputArea.setText( output );

      // Set application window attributes
      setTitle( "Statistical Summary" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 200, 150 );
      setVisible( true );
 
   }  // end constructor

   // This method receives an array of integer values and returns
   // average
   public double average(int theData[])
   {
      double total = 0;
      for (int i = 0; i < theData.length; i++)
         total  = total + theData[i];
      return total / theData.length;
   }

   // This method receives an array of integer values and returns
   // maxiumum value in the array
   public double maximum(int theData[])
   {
      int tempMax = theData[0];  // Assume first value is maximum
      for (int i = 0; i < theData.length; i++)
         if (theData[i] > tempMax)
            tempMax = theData[i];
      return tempMax;
   }

   // This method receives an array of integer values and returns
   // minimum value in the array
   public double minimum(int theData[])
   {
      int tempMin = theData[0];  // Assume first value is minimum
      for (int i = 0; i < theData.length; i++)
         if (theData[i] < tempMin)
            tempMin = theData[i];
      return tempMin;
   }
   
   // This method receives an array of integer values and returns
   // their median
   public double median(int theData[])
   {
      int startScan = 0;
      int index = 0;
      int minIndex, minValue;
      
      //Sort section
      for (startScan = 0; startScan < (theData.length-1); startScan++)
      {
          minIndex = startScan;
          minValue = theData[startScan];
          for(index = startScan + 1; index < theData.length; index++)
          {
              if (theData[index] < minValue)
              {
                  minValue = theData[index];
                  minIndex = index;
              }
          }
          theData[minIndex] = theData[startScan];
          theData[startScan] = minValue;
       }
            
      return theData[(index-1)/2];
   }
   
   // Main method - to launch application
   public static void main( String args[] )
   { 
      StatsArray application = new StatsArray();
   }


}  // end StatsArray application class

