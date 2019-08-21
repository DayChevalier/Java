/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 *
 * @author Dayton Chevalier
 * This application verifies the correctness of a password. 
 */
public class PassWordVerify extends JFrame implements ActionListener
{
   // Class wide component declarations
   private JTextField passField;
   private JLabel passLabel;
   private JButton goButton;

   // set up GUI
   public PassWordVerify()
   {
      // Get access to JFrame container 
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );
      
      // Construct GUI - associate listener method
      passLabel = new JLabel("Enter Password");
      frameContainer.add( passLabel );
      passField = new JTextField( 15 );
      frameContainer.add( passField );
      goButton = new JButton("Test Password");
      frameContainer.add( goButton );
      goButton.addActionListener( this );

      // Set application window attributes
      setTitle( "Password Verification" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 275, 150 );
      setVisible( true );

   } // end constructor PassWordVerify

   // React to button click by verifying corretness of
   // password.
   public void actionPerformed( ActionEvent event )
   {
       String message = new String();
       String testPassword = passField.getText();

       // Call method to test password
       if (validPassword(testPassword))
          message = "Valid Password";
       else
          message = "Invalid Password";

       // Report results to user
       JOptionPane.showMessageDialog( null, message );

   } // end actionPerformed

   // This method receives a password and tests it.
   // Passwords read must have:
   //   * At least one uppercase characer
   //   * At least one lowercase character
   //   * At least one digit
   //   * At least 6, but no more than 10 characters long
   public boolean validPassword( String password )
   {
       boolean isOK = true;                   // Assume a good password
       
       int checkLength;
       checkLength = password.length();
       if (checkLength >= 6 && checkLength <= 10)
       {
           isOK = password.matches(".*[0-9].*");
           if (isOK == true)
           {
              isOK = password.matches(".*[a-z].*");
               if (isOK == true)
               {
                  isOK = password.matches(".*[A-Z].*"); 
               }
           }
       }
       else
           isOK = false;


       return isOK;

   } // end validPassword

   // Main method - to launch application
   public static void main( String args[] )
   { 
      PassWordVerify application = new PassWordVerify();
   }

} // end class PassWordVerify

