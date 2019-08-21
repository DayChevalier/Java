package assignment10b;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Front-end for college registration process
 * @author Dayton Chevalier
 */
public class WxRpt extends JFrame 
{
   private JTextField outputField,visField;
   private JLabel visLabel,skyLabel;
   private ButtonGroup radioGroup;
   private JCheckBox icingBox;
   private JComboBox skyList;
   private JButton goButton;
   
   String outSky,visString, icingString;
   
   String skyCover[] = {"Clear","Scattered","Broken","Overcast"};

   public WxRpt()
   {
      Container theContainer = getContentPane();
      theContainer.setLayout( new FlowLayout() );
      
      outSky = new String("Clear");
      visString = new String("");
      icingString = new String("");
      
      // Text field for visibility 
      visLabel = new JLabel( "Visibility" );
      theContainer.add( visLabel ); 
      visField = new JTextField( 8 );
      theContainer.add( visField ); 
      
      
      // Make altitude drop-down list
      skyLabel = new JLabel( "Sky cover" );
      theContainer.add( skyLabel ); 
      skyList = new JComboBox( skyCover );
      theContainer.add( skyList );
      
      
      // Make icing checkbox
      icingBox = new JCheckBox("Icing");
      theContainer.add(icingBox);
      
      
      // Button to submit info
      goButton = new JButton("Submit");
      theContainer.add( goButton ); 

      
      // Output text field
      outputField = new JTextField( 15 );
      outputField.setEditable( false );
      theContainer.add( outputField ); 
      
      
      // Add event handlers
      ListHandler skyListHandler = new ListHandler();
      skyList.addItemListener( skyListHandler );   

      GoButtonHandler buttonHandler = new GoButtonHandler();
      goButton.addActionListener( buttonHandler );

      
      
      // Set application attributes
      setSize( 220, 200 );
      setVisible( true );
      setTitle( "Sky Cover Analysis" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   
   
   
   
   // Handler for a change in the sky cover list
   private class ListHandler implements ItemListener 
   {
      public void itemStateChanged( ItemEvent e )
      {
          if ( e.getSource() == skyList ) 
            outSky = skyCover[skyList.getSelectedIndex()];
      }
   }


   
   
   // Handler for a  button  click
   private class GoButtonHandler implements ActionListener 
   {
      public void actionPerformed( ActionEvent e )
      {
        if ( e.getSource() == goButton ) 
        {
            visString = new String(visField.getText());
            if (icingBox.isSelected() == true)
                icingString = new String("ICING");
            else
                icingString = new String("");
            outputField.setText("Visibility: " + visString + "  Sky cover: "
                    + outSky + " : " + icingString);

        }
      }
   }

      
      

   // Launch main application object
   public static void main( String args[] )
   {
      WxRpt app = new WxRpt();
   }

} 
