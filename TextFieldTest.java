/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment6a;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Dayton Chevalier
 * This application demonstrates Java text fields. 
 * If the user presses "Enter" for ...
 * Text field 1, then text is displayed in a dialog box
 * Text field 2, then text is displayed in uneditable text field 
 */
public class TextFieldTest extends JFrame 
{
   // Class wide component declarations
   private JTextField textField1, textField2; 
   private JTextField outputText;
   private JLabel label1, label2; 
   private JButton buttonSwitchText;

   // set up GUI
   public TextFieldTest()
   {
      // Get access to JFrame container - required to add components
      // Set layout to flow layout; allow components to be displayed
      // left-to-right and top-to-bottom
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );
      
      // Construct textfield1 and its label
      label1 = new JLabel("Text Field 1");
      frameContainer.add( label1 );
      textField1 = new JTextField( 15 );
      frameContainer.add( textField1 );
      
      // Construct textfield2 and its label
      label2 = new JLabel("Text Field 2");
      frameContainer.add( label2 );
      textField2 = new JTextField( 10 );
      frameContainer.add( textField2 );
      
      // Construct button
      buttonSwitchText = new JButton("Switch");
      frameContainer.add( buttonSwitchText);
      
      // Install text field for output only
      outputText = new JTextField( 20 );
      outputText.setEditable( false);     // Cannot write to this text field
      frameContainer.add( outputText );

      // Register event handler to each text field
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener( handler );
      textField2.addActionListener( handler );
      buttonSwitchText.addActionListener( handler );

      // Set application window attributes
      setTitle( "Testing JTextField Objects" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 275, 150 );
      setVisible( true );

   } // end constructor TextFieldTest

   // Private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // Process textfield events - Same event handler is associated with
      // both text fields.  Using getSource() method, individual action
      // for either is determined.
      public void actionPerformed( ActionEvent event )
      {
         // If user presses Enter in JTextField textField1
         // then display text in a dialog box
         if ( event.getSource() == textField1 )
         {
            String outStr = "textField1: " + textField1.getText();
            JOptionPane.showMessageDialog( null, outStr );
         }
      
         // If user presses Enter in JTextField textField2
         // then display text in uneditable text field
         else if ( event.getSource() == textField2 )
         {
            String outStr = "textField2: " + textField2.getText();
            outputText.setText(outStr);
         }
         // If user clicks the Jbutton switchtext
         // then display the two text fields in reverse.
         else if (event.getSource() == buttonSwitchText )
         {
             String temp;
             temp = textField1.getText();
             textField1.setText(textField2.getText());
             textField2.setText(temp);
         }
      } // end method actionPerformed
   } // end TextFieldHandler class

   
   // Main method - to launch application
   public static void main( String args[] )
   { 
      TextFieldTest application = new TextFieldTest();
   }

} // end class TextFieldTest 

