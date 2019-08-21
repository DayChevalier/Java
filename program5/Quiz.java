package program5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

/**
 *
 * @author Dayton Chevalier
 * The classes that allow for quiz creation
 */
public class Quiz extends JFrame
{
    //GUI Declarations
    JLabel       inputLabel0 = new JLabel("Input Student Number:");
    JTextField   inputText0 = new JTextField(5);
    JLabel       inputLabel1 = new JLabel("Question 1:");
    JTextField   inputText1 = new JTextField(1);
    JLabel       inputLabel2 = new JLabel("Question 2:");
    JTextField   inputText2 = new JTextField(1);
    JLabel       inputLabel3 = new JLabel("Question 3:");
    JTextField   inputText3 = new JTextField(1);
    JLabel       inputLabel4 = new JLabel("Question 4:");
    JTextField   inputText4 = new JTextField(1);
    JLabel       inputLabel5 = new JLabel("Question 5:");
    JTextField   inputText5 = new JTextField(1);
    JLabel       inputLabel6 = new JLabel("Question 6:");
    JTextField   inputText6 = new JTextField(1);
    JLabel       inputLabel7 = new JLabel("Question 7:");
    JTextField   inputText7 = new JTextField(1);
    JLabel       inputLabel8 = new JLabel("Question 8:");
    JTextField   inputText8 = new JTextField(1);
    JButton      theButton = new JButton("Done");
    //Arrays for quiz info
    private final int QUESTIONS = 8;
    private String[] answerArray = new String[QUESTIONS];
    private String[] keyArray = new String[QUESTIONS];
    private int[] pointArray = new int[QUESTIONS];
    private int studentID;
    
    public Quiz()
    {
        for (int index = 0; index < QUESTIONS; index++)
        {
            answerArray[index] = "a";
            switch (index) {
                case 0: keyArray[index] = "a";
                    pointArray[index] = 10;
                    break;
                case 1: keyArray[index] = "c";
                    pointArray[index] = 5;
                    break;
                case 2: keyArray[index] = "d";
                    pointArray[index] = 10;
                    break;
                case 3: keyArray[index] = "d";
                    pointArray[index] = 5;
                    break;
                case 4: keyArray[index] = "b";
                    pointArray[index] = 5;
                    break;
                case 5: keyArray[index] = "a";
                    pointArray[index] = 15;
                    break;
                case 6: keyArray[index] = "c";
                    pointArray[index] = 20;
                    break;
                case 7: keyArray[index] = "a";
                    pointArray[index] = 10;
                    break;
            }
        }
        studentID = 00000;
       
        display();
   
    }
        
    public void setID(String ID)
    {
        try  
        {  
            studentID = Integer.parseInt( ID );  
        }  
        catch( Exception e)  
        {  
           JOptionPane.showMessageDialog( null, "Student Number is not a" 
           + " number, please input one. ", "Error",
           JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setQuestion(int index, String input)
    {
        answerArray[0] = input;
    }

    
    public String getQuestion(int index)
    {
        return answerArray[index];
    }
    
    
   // set up GUI
   public void display()
   {
       // Set up container
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );

      frameContainer.add( inputLabel0);
      frameContainer.add(inputText0);
      frameContainer.add( inputLabel1);
      frameContainer.add(inputText1 );
      frameContainer.add( inputLabel2);
      frameContainer.add(inputText2 );
      frameContainer.add( inputLabel3);
      frameContainer.add(inputText3 );
      frameContainer.add( inputLabel4);
      frameContainer.add(inputText4 );
      frameContainer.add( inputLabel5);
      frameContainer.add(inputText5 );
      frameContainer.add( inputLabel6);
      frameContainer.add(inputText6 );
      frameContainer.add( inputLabel7);
      frameContainer.add(inputText7 );
      frameContainer.add( inputLabel8);
      frameContainer.add(inputText8 );
      frameContainer.add( theButton );
      InputHandler handler = new InputHandler();
      theButton.addActionListener( handler );

      // Set application window attributes
      setTitle( "Quiz" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 500, 150 );
      setVisible( true );

   } // end constructor TextFieldTest
    
   // Private inner class for event handling
   private class InputHandler implements ActionListener
   {
      // Process button event
      public void actionPerformed( ActionEvent event )
      {    
         String input;
         if ( event.getSource() == theButton )
         {
             input = inputText0.getText();
             setID(input);
             input = inputText1.getText();
             inputCheck(input, 0);
             input = inputText2.getText();
             inputCheck(input, 1);
             input = inputText3.getText();
             inputCheck(input, 2);
             input = inputText4.getText();
             inputCheck(input, 3);
             input = inputText5.getText();
             inputCheck(input, 4);
             input = inputText6.getText();
             inputCheck(input, 5);
             input = inputText7.getText();
             inputCheck(input, 6);
             input = inputText8.getText();
             inputCheck(input, 7);
             output(calculate());
         }
      } // end method actionPerformed
   } 
   
   public void inputCheck(String input, int index)
   {
       if (!input.equals("a") && !input.equals("b") && !input.equals("c") &&
              !input.equals("d") )
       {
           JOptionPane.showMessageDialog( null, "Question " + (index+1) 
           + " does not contain a possible answer. Please enter "
           + "a, b, c, or d in lowercase only", "Error",
           JOptionPane.ERROR_MESSAGE);
       }
       else
           setQuestion(index, input);
   }
   
   public int calculate()
   {
                    
        int score = 0;
        for (int index = 0; index < QUESTIONS; index++)
        {
            if (answerArray[index].equals(keyArray[index]))
                score += pointArray[index];
        }
        return score;
   }

   public void output(int score)
   {
       String passing;
       if (score >= 50)
           passing = "Passed.";
       else
           passing = "Failed.";
       JOptionPane.showMessageDialog( null, "Student " + studentID
       + ", your score was " + score + " out of 80. You " + passing, "Results",
       JOptionPane.PLAIN_MESSAGE);
   }
}
