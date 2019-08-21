package Assignment13c;
import java.awt.*;
import javax.swing.*; 
/**
 *
 * @author Dayton Chevalier
 * A customized JPanel class for displaying bank logo.
 */

public class ImagePanel extends JPanel
{
   ImageIcon deltaImageIcon = new ImageIcon("smDeltaLogo.gif");
   Image deltaImage = deltaImageIcon.getImage();

   public void paintComponent( Graphics g )
   {
      // Set up drawing context
      super.paintComponent( g );
      
      // White background
      setBackground(Color.white);
      setSize(400,300);

      // Draw logo
      g.drawImage(deltaImage,50,23,this);
   }

   // Redraw image
   public void draw( String stringToDraw )
   {
      repaint();
   }
} 
