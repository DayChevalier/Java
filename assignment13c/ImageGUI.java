package Assignment13c;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

/**
 *
 * @author Dayton Chevalier
 * This application includes a dedicated drawing panel in order
 * to demonstrate displaying images in Java 
 */
public class ImageGUI extends JFrame
{
   private ImagePanel outputPanel;

    public ImageGUI()
   {
      // Create panel for drawing
      outputPanel = new ImagePanel();
 
      // Set up frame
      Container c = getContentPane();
      c.setLayout( new GridLayout(1,1) );
      
      c.add(outputPanel);     // Add drawing panel
   }

   public static void main( String args[] )
   { 
      ImageGUI app = new ImageGUI();

      // Set application attributes
      app.setSize( 196, 150 );
      app.setVisible( true );
      app.setTitle( "Favorite Logos" );
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
} 