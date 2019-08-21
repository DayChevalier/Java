package assignment11b;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*; 
/**
 *
 * @author Dayton Chevalier
 * This application will prompt the user for a file name, open it, and then
 * display the contents in the GUI text area.
 */
public class DisplayText extends JFrame 
{
   private JTextArea outArea;
   private JButton doItButton;

   private String textLine = new String("");
   private String outString = new String();

   // Constructor - Set up GUI and App
   public DisplayText()
   {
      super( "Display User Text" );
    
      // Set up text field for file contents display
      outArea = new JTextArea( 8,8 );
      outArea.setEditable( false );

      doItButton = new JButton( "Get It" );
      doItButton.addActionListener(
         new ActionListener()
         {
            public void actionPerformed( ActionEvent e )
            {
               JFileChooser fileFind = new JFileChooser();
               int status = fileFind.showOpenDialog(null);
               if (status == JFileChooser.APPROVE_OPTION)
               {
                   try
                   {
                       File selectedFile = fileFind.getSelectedFile();
                       BufferedReader file_in = new BufferedReader(new FileReader(selectedFile));
                       String data = "";
                       String output = "";
                       while ((data = file_in.readLine()) != null)
                       {
                           output += "\n" + data;
                       }
                       outArea.setText(output);
                   }
                   catch(IOException ioe)
                   {
                       outArea.setText("Error: File cannot be read!");
                   }
               }
            }
         }  
      );
    
      // Add all components to application window
      Container container = getContentPane();
      container.setLayout (new BorderLayout() );
      container.add(outArea, BorderLayout.NORTH);
      container.add(doItButton, BorderLayout.SOUTH);

      // Set application window attributes
      setTitle( "Your Bank Account" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 500, 500 );
      setVisible( true );
   }

   public static void main( String args[] )
   {
      DisplayText app = new DisplayText();
   }

 } 
