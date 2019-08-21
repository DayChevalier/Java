/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9b;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.StringTokenizer;
/**
 *
 * @author Dayton Chevalier
 * This application will break the string components
 * of a URL apart 
 * 
 */

public class DoURL extends JFrame implements ActionListener
{
   // Declare components
   private JTextField inputField;
   private JTextArea outputTextArea;
   private JLabel inLabel, outLabel;
   private JButton goButton;


   private String startString
     = new String("http://www.delta.edu/weather/climate/today.html");

   // Application default constructor
   public DoURL()
   {
      // Set up GUI
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );
      
      inLabel = new JLabel("Enter URL");
      frameContainer.add( inLabel );
      inputField = new JTextField( startString, 30 );
      frameContainer.add( inputField );

      goButton = new JButton("Convert");
      goButton.addActionListener( this );
      frameContainer.add( goButton );

      outputTextArea = new JTextArea( 20, 35 );
      outputTextArea.setEditable( false );
      frameContainer.add( outputTextArea );
      
      // Set application window attributes
      setTitle( "URL Diagnosis" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 600, 400 );
      setVisible( true );

   } // end constructor 

   // Handle button click
   public void actionPerformed( ActionEvent event )
   {
       outputTextArea.setText(breakURL( startString ));

   } // end actionPerformed method

   // This method breaks a URL string into its components:
   // Domain, directory, and file name
   public String breakURL( String startString )
   {
       String finalString = new String();
       
       StringTokenizer tokenized = new StringTokenizer(startString, "/");
       String firstPart;
       String secondPart;
       String thirdPart;
       String extra;
       
       // Complete this algorithm
       extra = tokenized.nextToken();
       firstPart = tokenized.nextToken();
       secondPart = tokenized.nextToken();
       secondPart += "/" + tokenized.nextToken();
       thirdPart = tokenized.nextToken();


       finalString = "Domain: " + firstPart
       + "     Directory: " + secondPart
       + "     File name: " + thirdPart;
       return finalString;
   }


   // Main method - to launch application
   public static void main( String args[] )
   { 
      DoURL application = new DoURL();
   }

} // end class TextFieldTest 
