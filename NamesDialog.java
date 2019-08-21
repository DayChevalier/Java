package assignment6c;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Dayton Chevalier
 * This program demonstrates using dialogs with
 * JOptionPane. 
 */
public class NamesDialog extends JFrame implements ActionListener 
{
    
   private JLabel firstLabel, middleLabel, lastLabel;
   private JTextField firstField, middleField, lastField;
   private JButton displayButton;
   
      // Set up GUI
   public NamesDialog()
   {
      // Get content pane and change its layout to FlowLayout
      Container container = getContentPane();  
      container.setLayout( new FlowLayout() ); 

      // Set up firstLabel and firstField
      firstLabel = new JLabel( "First Name?" );
      firstField = new JTextField( 10 );
      container.add( firstLabel );
      container.add( firstField );

      // set up middleLabel and middleField
      middleLabel = new JLabel( "Middle Name?" );
      middleField = new JTextField( 10 );
      container.add( middleLabel );
      container.add( middleField );

      // set up lastLabel and lastField
      lastLabel = new JLabel( "Last Name?" );
      lastField = new JTextField( 10 );
      container.add( lastLabel );
      container.add( lastField );

      // set up displayButton
      displayButton = new JButton( "Display Name" );
      container.add( displayButton );

      // Register event handlers
      displayButton.addActionListener( this );

      // Set application window attributes
      setTitle( "Full Name Display" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 400, 300 );
      setVisible( true );

   } // end method init
   
   
   
      // event handler for button
   public void actionPerformed( ActionEvent event )
   {
     // process displayButton event
      if ( event.getSource() == displayButton )
      {
          // Display a greeting
        JOptionPane.showMessageDialog(null, "Hello " +
            firstField.getText() + " " + middleField.getText() +
                        " " + lastField.getText());
      }
   }

   // Main method - to launch application
   public static void main( String args[] )
   { 
      NamesDialog application = new NamesDialog();
   }
} 