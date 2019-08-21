package assignment11a;
import javax.swing.JOptionPane;  // import class JOptionPane
/**
 *
 * @author Dayton Chevalier
 * This program prompts the user for an integer code number for
 * a Big Ten team.  It then looks up and displays the school name 
 * associated with the code code 
 */

public class GetIndex 
{
   public static void main( String args[] )
   {
       int index = -1;
       String BigTenNames[] 
          = {"Purdue", "Michigan State", "Michigan", "Ohio State", 
                 "Iowa", "Penn State", "Indiana", "Minnesota",
                 "Northwestern", "Illinois", "Wisconsin"};
       boolean continuation = true;
       
       do
       { 
          // Access index from user
          String indexRequest 
        = JOptionPane.showInputDialog( "Enter code for Big Ten School" );
          
          
              try
              {  
                  index = Integer.parseInt( indexRequest );
              }
              catch( NumberFormatException e)  
              {  
                  JOptionPane.showMessageDialog( null, "This is not a proper" 
                      + " number, please input one. ", "Error",
                      JOptionPane.ERROR_MESSAGE);
              }
              
              // Display name for selected team code
              try
              {
                  JOptionPane.showMessageDialog(
                          null, "The team is " + BigTenNames[index], "Big Ten Selector",
                          JOptionPane.PLAIN_MESSAGE );
              }
              catch (ArrayIndexOutOfBoundsException e)
              {
                  JOptionPane.showMessageDialog( null, "This is not a proper" 
                          + " entry for a school, please input one. ", "Error",
                          JOptionPane.ERROR_MESSAGE);
              }  
         
     // Prompt user to continue or not
     String continueReq = JOptionPane.showInputDialog( "Continue:  Y or N" );  
     if (continueReq.equals("N") || continueReq.equals("n"))
         continuation = false;
     
   } while (continuation == true);
      
      System.exit( 0 );   // terminate the program
   }
} 