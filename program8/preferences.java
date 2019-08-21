package program8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Dayton Chevalier
 * An application that acts as a "front-end" GUI
 * to set preferences for a computer game.
 */
public class preferences extends JFrame
{
    JPanel p1 = new JPanel(new GridLayout(0,1,2,2));
    JLabel       nameLabel = new JLabel("Player Name:");
    JTextField   nameText = new JTextField(10);
    JPanel p2 = new JPanel(new GridLayout(0,1,2,2));
    JLabel       levelLabel = new JLabel("Your difficulty setting:");
    JRadioButton   beginnerButton = new JRadioButton("Beginner");
    JRadioButton   experiencedButton = new JRadioButton("Exerienced");
    JRadioButton   advancedButton = new JRadioButton("Advanced");
    JRadioButton   expertButton = new JRadioButton("Expert");
    ButtonGroup    group = new ButtonGroup();
    JPanel p3 = new JPanel(new GridLayout(0,1,2,2));
    JLabel      speedLabel = new JLabel("Slide to select your speed:");
    JSlider     speedSlider = new JSlider(JSlider.HORIZONTAL,0, 80, 10);
    JLabel      emailLabel = new JLabel("I want Emails and Texts sent to me:");
    JCheckBox   emailBox = new JCheckBox();
    JLabel      colorLabel = new JLabel("Color of game pieces:");
    String[] colorStrings = {"Blue", "Red", "Green", "Yellow", "Purple"};
    JComboBox   colorCombo = new JComboBox(colorStrings); 
    JButton     submitButton = new JButton("Submit");
    
    preferencesObject newPreference = new preferencesObject();
    
    public preferences()
    {
        Display();
    }
    
   // set up GUI
   public void Display()
   {
       // Set up container
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );

      frameContainer.add(p1);
      p1.add(nameLabel);
      p1.add(nameText);
      frameContainer.add(p2);
      p2.add(levelLabel);
      group.add(beginnerButton);
      group.add(experiencedButton);
      group.add(advancedButton);
      group.add(expertButton);
      p2.add(beginnerButton);
      p2.add(experiencedButton);
      p2.add(advancedButton);
      p2.add(expertButton );
      frameContainer.add(p3);
      p3.add(speedLabel );
      speedSlider.setMajorTickSpacing(20);
      speedSlider.setMinorTickSpacing(5);
      speedSlider.setPaintTicks(true);
      speedSlider.setPaintLabels(true);
      p3.add(speedSlider );
      frameContainer.add(emailLabel );
      frameContainer.add(emailBox );
      frameContainer.add(colorLabel );
      frameContainer.add(colorCombo );
      frameContainer.add(submitButton );
      InputHandler handler = new InputHandler();
      submitButton.addActionListener( handler );

      // Set application window attributes
      setTitle( "Setting Preferences");
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 275, 375 );
      setVisible( true );

   }
    
   // Private inner class for event handling
   private class InputHandler implements ActionListener
   {
      // Process button event
      public void actionPerformed( ActionEvent event )
      {    
          newPreference.setName(nameText.getText());
          
          if (beginnerButton.isSelected())
              newPreference.setComplexity(0);
          else if (experiencedButton.isSelected())
              newPreference.setComplexity(1);
          else if (advancedButton.isSelected())
              newPreference.setComplexity(2);
          else
              newPreference.setComplexity(3);
          
          newPreference.setSpeed(speedSlider.getValue());
          
          newPreference.setEmails(emailBox.isSelected());
          
          newPreference.setColor((colorCombo.getSelectedItem()).toString());
          
          JOptionPane.showMessageDialog( null, "Saved Information." + "\n"
                  + newPreference.toString(), "Submitted",
                  JOptionPane.PLAIN_MESSAGE);
      } // end method actionPerformed
    
   }
    
    
    
    public static void main(String[] args) {
        preferences fresh = new preferences();
        
    }
}
