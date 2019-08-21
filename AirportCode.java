/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * This application returns the name of an airport given
 * its code 
 * 
 */
package assignment7b;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 *
 * @author Dayton Chevalier
 */

public class AirportCode extends JFrame
{
   // Class wide component declarations
   private JTextField inputText;
   private JLabel     inputLabel;
   private JButton    theButton;

   // set up GUI
   public AirportCode()
   {
      // Set up container
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );
      
      // Construct textfield1 and its label
      inputLabel = new JLabel("Airport Code");
      frameContainer.add( inputLabel );
      inputText = new JTextField( 5 );
      frameContainer.add( inputText );

      // Set up button and associate with event handler
      theButton = new JButton("Get Name");
      frameContainer.add( theButton );
      ButtonHandler handler = new ButtonHandler();
      theButton.addActionListener( handler );

      // Set application window attributes
      setTitle( "Airport Code Identifier" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 200, 150 );
      setVisible( true );

   } // end constructor TextFieldTest

   // Private inner class for event handling
   private class ButtonHandler implements ActionListener
   {
      // Process button event
      public void actionPerformed( ActionEvent event )
      {    
         if ( event.getSource() == theButton )
         {
             // Get text from text field
             String airportCode = inputText.getText();
             
             // Set arrays
             String[] code = {"MBS", "GRR", "LAN", "DTW", "FNT", "TVC"};
             String[] name = {"Saginaw", "Grand Rapids", "Lansing", "Detroit",
                 "Flint", "Traverse City"};
             int index = 0;
             int element = -1;
             boolean found = false;
             
             // Search for code
             while (!found && index < code.length)
             {
                 if (code[index].equals(airportCode))
                 {
                     found = true;
                     element = index;
                 }
                 index++;
             }
             if (element >= 0)
             {
                String outString = "Airport is: " + name[element];
                JOptionPane.showMessageDialog( null, outString );
             }
             else
             {
                 JOptionPane.showMessageDialog( null, "This is not proper "
                         + "input. Please input an airport code.", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }
         }
      
      } // end method actionPerformed
   } 

   // Main method - to launch application
   public static void main( String args[] )
   { 
      AirportCode application = new AirportCode();
   }

} // end class TextFieldTest 