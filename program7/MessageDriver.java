package program7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Dayton Chevalier
 * An application for exchanging coded messages between embassies.
 */
public class MessageDriver extends JFrame
{
    JLabel       countryLabel = new JLabel("Country to send to:");
    JTextField   countryText = new JTextField(2);
    JLabel       sendLabel = new JLabel("Your outgoing message:");
    JTextArea   sendArea = new JTextArea(5, 15);
    JLabel       recieveLabel = new JLabel("New incoming message:");
    JTextArea   recieveArea = new JTextArea(5, 15);
    JButton      sendButton = new JButton("Send");
    
    public MessageDriver()
    {
        Display();
    }
    
   // set up GUI
   public void Display()
   {
       // Set up container
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );

      frameContainer.add(countryLabel);
      frameContainer.add(countryText);
      frameContainer.add(sendLabel);
      frameContainer.add(sendArea);
      frameContainer.add(recieveLabel);
      frameContainer.add(recieveArea);
      frameContainer.add(sendButton );
      InputHandler handler = new InputHandler();
      sendButton.addActionListener( handler );

      // Set application window attributes
      setTitle( "Embassy Message");
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 200, 325 );
      setVisible( true );

   }
    
   // Private inner class for event handling
   private class InputHandler implements ActionListener
   {
      // Process button event
      public void actionPerformed( ActionEvent event )
      {    
         if ( event.getSource() == sendButton)
         {
             boolean check = false;
             Message newMessage = new Message();
             
             while (check == false)
             {
                 check = newMessage.validateCode(countryText.getText());
                 if (check == true)
                 {
                     newMessage.setRecieverCode(countryText.getText());
                     newMessage.setInputMessage(sendArea.getText());
                     newMessage.encode();
                     newMessage.translate();
                     recieveArea.append("To ");
                     recieveArea.append(newMessage.getRecieverCountry());
                     recieveArea.append(":" + "\n");
                     recieveArea.append(newMessage.getOutputMessage());
                 }
                 else
                 {
                     JOptionPane.showMessageDialog( null, "Incorrect code." 
                         + " Enter another. ", "Error",
                         JOptionPane.ERROR_MESSAGE);
                 }
             }
         }
      } // end method actionPerformed
    
   }
    
    
    
    public static void main(String[] args) {
        MessageDriver fresh = new MessageDriver();
        
    }
}
