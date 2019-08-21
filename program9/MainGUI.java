package program9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dayton Chevalier
 * The main application GUI. 
 */
public class MainGUI extends JFrame
{
    JPanel p1 = new JPanel(new GridLayout(0,1,2,2));
    JLabel       addressLabel = new JLabel("Address:");
    JTextField   addressText = new JTextField(5);
    JPanel p2 = new JPanel(new GridLayout(0,1,2,2));
    JButton     submitButton = new JButton("Submit");
    JButton     clearButton = new JButton("Clear");
    JPanel p3 = new JPanel(new GridLayout(0,1,2,2));
    JButton     button0 = new JButton("0");
    JButton     button1 = new JButton("1");
    JButton     button2 = new JButton("2");
    JButton     button3 = new JButton("3");
    JButton     button4 = new JButton("4");
    JButton     button5 = new JButton("5");
    JButton     button6 = new JButton("6");
    JButton     button7 = new JButton("7");
    JButton     button8 = new JButton("8");
    JButton     button9 = new JButton("9");
    
    addressFileClass newFile = new addressFileClass();
    
    public MainGUI()
    {
        newFile.setList("zipMI.txt");
        Display();

    }
    
   // set up GUI
   public void Display()
   {
       // Set up container
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );

      frameContainer.add(p1);
      p1.add(addressLabel);
      p1.add(addressText);
      addressText.setEditable(false);
      frameContainer.add(p2);
      p2.add(submitButton);
      p2.add(clearButton);
      frameContainer.add(p3);
      p3.add(button0);
      p3.add(button1);
      p3.add(button2);
      p3.add(button3);
      p3.add(button4);
      p3.add(button5);
      p3.add(button6);
      p3.add(button7);
      p3.add(button8);
      p3.add(button9);
      
      InputHandler handler = new InputHandler();
      submitButton.addActionListener( handler );
      clearButton.addActionListener( handler );
      button0.addActionListener( handler );
      button1.addActionListener( handler );
      button2.addActionListener( handler );
      button3.addActionListener( handler );
      button4.addActionListener( handler );
      button5.addActionListener( handler );
      button6.addActionListener( handler );
      button7.addActionListener( handler );
      button8.addActionListener( handler );
      button9.addActionListener( handler );
      
      
      // Set application window attributes
      setTitle( "Address Input");
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 275, 375 );
      setVisible( true );

   }
    
   // Private inner class for event handling
   private class InputHandler implements ActionListener
   {
      // Process button event
      public void actionPerformed( ActionEvent e )
      {    
          String numberAdder;
          if (e.getSource() == submitButton)
          {
              if ((addressText.getText()).length() == 5)
              {
                  String found;
                  newFile.setAddress(addressText.getText());
                  found = newFile.search();
                  output(found);
              }
              else
              {
                  JOptionPane.showMessageDialog( null, "Input Error." + "\n"
                          + "Number to big or small.", "ERROR",
                          JOptionPane.ERROR_MESSAGE);
              }
          }
          else if (e.getSource() == clearButton)
          { 

              addressText.setText("");
          }
          else if (e.getSource() == button0)
          {
              numberAdder = addressText.getText();
              numberAdder +="0";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button1)
          {
              numberAdder = addressText.getText();
              numberAdder +="1";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button2)
          {
              numberAdder = addressText.getText();
              numberAdder += "2";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button3)
          {
              numberAdder = addressText.getText();
              numberAdder +="3";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button4)
          {
              numberAdder = addressText.getText();
              numberAdder +="4";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button5)
          {
              numberAdder = addressText.getText();
              numberAdder +="5";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button6)
          {
              numberAdder = addressText.getText();
              numberAdder +="6";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button7)
          {
              numberAdder = addressText.getText();
              numberAdder +="7";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button8)
          {
              numberAdder = addressText.getText();
              numberAdder +="8";
              addressText.setText(numberAdder);
          }
          else if (e.getSource() == button9)
          {
              numberAdder = addressText.getText();
              numberAdder +="9";
              addressText.setText(numberAdder);
          }
      } // end method actionPerformed
    
   }
    
   
   
   public void output(String foundAddress)
   {
       if (foundAddress == "")
       {
       JOptionPane.showMessageDialog( null, "No such address on file!",
               "Address not found!", JOptionPane.PLAIN_MESSAGE);
       }
       else
       {
       JOptionPane.showMessageDialog( null, "Address information!" + "\n"
               + foundAddress, "Address found!", JOptionPane.PLAIN_MESSAGE);
       }
   }
    
    public static void main(String[] args) {
        MainGUI fresh = new MainGUI();
        
    }
}
