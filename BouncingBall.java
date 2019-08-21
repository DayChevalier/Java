import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Dayton Chevalier
 * This applet uses a Timer object to animate
 * a bouncing ball. 
 */
public class BouncingBall extends JApplet
{
   private final int X1 = 109;          // Ball1's X coordinate
   private final int X2 = 209;          // Ball2's X coordinate
   private final int WIDTH1 = 40;       // Ball1's width
   private final int HEIGHT1 = 40;      // Ball1's height
   private final int WIDTH2 = 20;       // Ball2's width
   private final int HEIGHT2 = 20;      // Ball3's height
   private final int TIME_DELAY = 40;  // Ball's time delay
   private final int MOVE = 20;         // Pixels to move ball
   private final int MINIMUM_Y = 50;    // Max height of ball
   private final int MAXIMUM_Y = 400;   // Min height of ball
   private int y = 400;                 // Ball's Y coordinate
   private boolean goingUp = true;      // Direction indicator
   private Timer timer1;                 // Timer object

               
   /**
      init method
   */

   public void init()
   {
      timer1 = new Timer(TIME_DELAY, new TimerListener());
      timer1.start();      

   }
   
   /**
      paint method
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the superclass paint method.
      super.paint(g);
      
      // Set the drawing color to red.
      g.setColor(Color.yellow);
      
      // Draw the ball.
      g.fillOval(X1, y, WIDTH1, HEIGHT1);
      
      g.setColor(Color.blue);
      
      g.fillOval(X2, y, WIDTH2, HEIGHT2);
   }
   
   
   


   /**
      Private inner class that handles the Timer object's
      action events.
   */
   
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Update the ball's Y coordinate.
         if (goingUp)
         {
            if (y > MINIMUM_Y)
               y -= MOVE;
            else
               goingUp = false;
         }
         else
         {
            if (y < MAXIMUM_Y)
               y += MOVE;
            else
               goingUp = true;
         }
            
         // Force a call to the paint method.
         repaint();
      }
   }
   
   
   private class TimerListener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Update the ball's Y coordinate.
         if (goingUp)
         {
            if (y > MINIMUM_Y)
               y -= MOVE;
            else
               goingUp = false;
         }
         else
         {
            if (y < MAXIMUM_Y)
               y += MOVE;
            else
               goingUp = true;
         }
            
         // Force a call to the paint method.
         repaint();
      }
   }
   
}
