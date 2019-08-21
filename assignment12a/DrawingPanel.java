package assignment12a;
import javax.swing.*;
import java.awt.*; 

/**
 *
 * @author Dayton Chevalier
 * This class creates a panel that example shapes are
 * drawn on.
 */
public class DrawingPanel extends JPanel
{
   // Declare a check box array.
   private JCheckBox[] checkBoxArray;
   
   /**
      Constructor
   */
      
   public DrawingPanel(JCheckBox[] cbArray)
   {
      // Reference the check box array.
      checkBoxArray = cbArray;
      
      // Set the background color to white.
      setBackground(Color.white);
      
      // Set the preferred size of the panel.
      setPreferredSize(new Dimension(500, 400));
   }
   
   /**
      paintComponent method
      @param g The panel's Graphics object.
   */
   
   public void paintComponent(Graphics g)
   {
      // Call the superclass paintComponent method.
      super.paintComponent(g);
      
      // Draw the selected shapes.
      if (checkBoxArray[0].isSelected())
      {
         g.setColor(Color.black);
         g.drawLine(100, 0, 290, 190);
      }
      if (checkBoxArray[1].isSelected())
      {
         g.setColor(Color.black);
         g.drawRect(100, 350, 250, 150);
      }
      if (checkBoxArray[2].isSelected())
      {
         g.setColor(Color.blue);
         g.fillRect(300, 200, 100, 100);
      }
      if (checkBoxArray[3].isSelected())
      {
         g.setColor(Color.black);
         g.drawOval(40, 155, 75, 50);
      }  
      if (checkBoxArray[4].isSelected())
      {
         g.setColor(Color.blue);
         g.fillOval(300, 300, 50, 50);
      }
      if (checkBoxArray[5].isSelected())
      {
         g.setColor(Color.green);
         Font font = new Font("SanSerif", Font.BOLD, 24);
         g.setFont(font);
         g.drawString("Delta College", 300, 50);
      }
   }
} 
