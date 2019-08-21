import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Dayton Chevalier
 * An applet to display a variety of images
 */
public class DrawingApplet extends JApplet {
  public void init()
   {   
       Container frameContainer = getContentPane();
       frameContainer.setLayout( new FlowLayout() );

       setSize( 500, 400 );
       setVisible( true );
   }
   
   /**
      paint method
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the superclass paint method.
      super.paint(g);
      
      // Smily face
      g.setColor(Color.yellow);
      g.fillOval(50,50,100,100);
      g.setColor(Color.black);
      g.drawLine(80, 100, 80, 70);
      g.drawLine(120, 100, 120, 70);
      g.drawArc( 80, 110, 40, 20, 180, 180); 
      
      //House
      int[] x = {230, 320, 410};
      int[] y = {100, 50, 100};
      g.drawPolygon(x, y, 3);
      g.drawRect(245, 100, 150, 100);
      g.drawRect(300, 150, 40, 50);
      g.drawRect(260, 110, 20, 20);
      g.drawRect(360, 110, 20, 20);
    
      //Tree
      g.setColor( new Color(150, 100, 0));
      g.fillRect(450, 150, 20, 50);
      g.setColor(Color.green);
      int[] x2 = {430, 460, 490};
      int[] y2 = {150, 90, 150};
      g.fillPolygon(x2, y2, 3);
      int[] x3 = {435, 460, 485};
      int[] y3 = {120, 70, 120};
      g.fillPolygon(x3, y3, 3);
      
      //Logo
      g.setColor(Color.green);
      int[] x4 = {50, 125, 200};
      int[] y4 = {325, 225, 325};
      g.fillPolygon(x4, y4, 3);
      g.setColor(Color.yellow);
      Font font = new Font("SanSerif", Font.BOLD, 48);
      g.setFont(font);
      g.drawString("D", 80, 325);
      g.drawString("T", 110, 290);
      g.drawString("C", 135, 325);
      
      //Monster
      g.setColor(Color.green);
      int[] x5 = {450, 450, 350};
      int[] y5 = {400, 300, 350};
      g.fillPolygon(x5, y5, 3);
      int[] x6 = {250, 250, 350};
      int[] y6 = {400, 300, 350};
      g.fillPolygon(x6, y6, 3);
      g.setColor(Color.blue);
      g.fillOval(300,300,100,100);
      g.setColor(Color.black);
      g.drawLine(330, 350, 330, 320);
      g.drawLine(370, 350, 370, 320);
      g.drawLine(325, 350, 335, 320);
      g.drawLine(375, 350, 365, 320);
      g.drawLine(335, 350, 325, 320);
      g.drawLine(365, 350, 375, 320);
      g.drawOval(355, 320, 30, 30);
      g.drawOval(315, 320, 30, 30);
      g.drawLine(325, 380, 335, 360);
      g.drawLine(375, 380, 365, 360);
      g.drawLine(335, 380, 325, 360);
      g.drawLine(365, 380, 375, 360);
      g.drawArc( 320, 355, 60, 30, 180, 180); 
      g.drawArc( 320, 355, 60, 30, 260, 260);
      
   }
}