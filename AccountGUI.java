package assignment10a;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 *
 * @author Dayton Chevalier
 * This application builds a non-functioning GUI for management of
 * an account 
 */
public class AccountGUI extends JFrame 
{
   private JTextField amtField;
   private JButton transactButton, cancelButton;
   private JLabel amtLabel, titleLabel;
   private JComboBox transactType;
   private JRadioButton savings,checking, stocks;
   private ButtonGroup radioGroup;
   private JPanel titlePanel;      // For bank title

   private String transactStrings[] =
      { "Deposit", "Withdrawal", "Balance", "Close" };
      
   private JPanel panelcenterLeft,paneltrueCenter, panelcenterRight;
   private JPanel bottomButtonPanel;
   private JPanel centerPanel;
   
   public AccountGUI()
   {
      
      // Create logo panel and color/font attributes
      titleLabel = new JLabel("TK Bank");
      titleLabel.setFont( new Font( "Monospaced", Font.BOLD, 24 ) );
      titleLabel.setForeground(Color.white);
      titlePanel = new JPanel();
      titlePanel.setBackground(Color.black);
      titlePanel.add(titleLabel);
      
       
      // CENTER LEFT panel
      panelcenterLeft = new JPanel();
      panelcenterLeft.setLayout( new GridLayout(2,1) );

      // Create transaction type list
      transactType = new JComboBox( transactStrings );
      panelcenterLeft.add( transactType );

      
      
      
      
      // TRUE CENTER panel
      paneltrueCenter = new JPanel();
      paneltrueCenter.setLayout( new GridLayout(3,1) );

      // Create radio buttons
      savings = new JRadioButton( "Savings", true );
      paneltrueCenter.add( savings );
      checking = new JRadioButton( "Checking", false);
      paneltrueCenter.add( checking );
      stocks = new JRadioButton( "Stocks", false);
      paneltrueCenter.add( stocks );

      // create logical relationship between JRadioButtons
      radioGroup = new ButtonGroup();
      radioGroup.add( savings );
      radioGroup.add( checking );
      radioGroup.add( stocks );

      
      
      
      
      // RIGHT CENTER panel
      panelcenterRight = new JPanel();
      panelcenterRight.setLayout( new GridLayout(2,1) );
      
      // Amount entry text field
      amtField = new JTextField( 8 );
      panelcenterRight.add( amtField );

      // Amount label
      amtLabel = new JLabel( "Enter Amount" );
      panelcenterRight.add( amtLabel );
      
      
      
      // Build panel at top
      centerPanel = new JPanel();
      centerPanel.setLayout( new GridLayout(1,3) );
      centerPanel.add( panelcenterLeft );
      centerPanel.add( paneltrueCenter );
      centerPanel.add( panelcenterRight );
      
 
      
      
      
      
 
      // Create button to perform transaction
      bottomButtonPanel = new JPanel();
      bottomButtonPanel.setLayout( new FlowLayout() );
      transactButton = new JButton( "Make Transaction" );
      bottomButtonPanel.add( transactButton );
      
      // Create button to cancel transaction
      cancelButton = new JButton( "Cancel" );
      bottomButtonPanel.add( cancelButton );

      // Set up frame
      Container container = getContentPane();
      container.setLayout( new GridLayout(3,1) );
      
      container.add(titlePanel);            // Middle drawing panel
      container.add(centerPanel);              // Top panel
      container.add(bottomButtonPanel);     // Button at botton
   }

   public static void main( String args[] )
   { 
      AccountGUI app = new AccountGUI();

      // Set application attributes
      app.setSize( 425, 150 );
      app.setVisible( true );
      app.setTitle( "TK Bank" );
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
} 