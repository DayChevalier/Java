import java.awt.*;
import java.applet.Applet;

/**
 *
 * @author Dayton Chevalier
 */
public class BarChart extends Applet
{    
   int regionSalesData[] = { 44, 32, 77, 56, 90 };            // Current sales data
   int prevRegionSalesData[] = { 40, 52, 61, 54, 45 };        // Last year's data
   String regionNames[] = {"CHI", "ATL", "LA", "MIA", "MBS"};

   public void paint( Graphics g ) 
   {
      g.drawString("Sales Summary by City",20,20);   // Title
      
      // Draw scale bar:  100 sales units is same as 200 pixels
      g.drawLine(50,50,50,200);       // Draw base line
      g.drawLine(150,50,150,200);     // Draw line for 50 sales units
      g.drawLine(250,50,250,200);     // Draw line for 100 sales units

      // Draw scale labels
      g.drawString("0",    48, 212);
      g.drawString("50",  145, 212);
      g.drawString("100", 242, 212);
      
      int X_pix = 20;                 // Initialize name x pixel (fixed value)
      int Y_pix = 50;                 // Initialize name y pixel (will vary)
      int Base_X = 50;                // Upper left of bar (x value for zero line)
      int barHeight = 10;             // Height of bar (fixed)
      int barWidth ;                  // Width of bar (calculated from sales value)      
    
      for (int i = 0; i < regionSalesData.length; i++)
      {
         g.setColor( Color.red );
         g.drawString(regionNames[i], X_pix, Y_pix + 15);  // Draw city name (with slight y adjustment)
 
         g.setColor( Color.green);
         barWidth = prevRegionSalesData[i] *2;
         g.fillRect(Base_X, Y_pix, barWidth, barHeight );
         
         g.setColor( Color.blue );
         barWidth = regionSalesData[i] * 2;                // Calculate width of bar (pixels = 2 x sales units)
         g.fillRect(Base_X, Y_pix+10, barWidth, barHeight );  // Draw bar
         
         Y_pix = Y_pix + 30;                               // Increment to next y position
      }

      g.setColor( Color.black);
      g.drawRect(50,225,175,65);
      
      g.setColor(Color.blue);
      g.fillRect(55, 230, 100, 25);
      g.setColor(Color.black);
      g.drawString("This Year", 160, 250);
      
      g.setColor(Color.green);
      g.fillRect(55, 260, 100, 25);
      g.setColor(Color.black);
      g.drawString("Last Year", 160, 280);
      
   }
}

// HTML CODE
/*
<html
<applet code="BarChart.class" width=400 height=600>
</applet>
</html>
*/ 