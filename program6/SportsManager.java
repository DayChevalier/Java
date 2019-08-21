package program6;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

/**
 *
 * @author Dayton Chevalier
 * An application that will track and manage scores
 * for a Delta sports team for one season.
 * 
 */
public class SportsManager extends JFrame
{
    JLabel       opponentLabel = new JLabel("Opponent Name:");
    JTextField   opponentText = new JTextField(10);
    JLabel       forScoreLabel = new JLabel("Delta Score:");
    JTextField   forScoreText = new JTextField(3);
    JLabel       againstScoreLabel = new JLabel("Opponent Score:");
    JTextField   againstScoreText = new JTextField(3);
    JButton      theButton = new JButton("Enter Game");
    JTextArea    resultArea = new JTextArea(5,20);
    Season thisSeason = new Season();
    int gameNumber = 0;
    String year;
    /**
     * @param args the command line arguments
     */
    
   public SportsManager()
   {
       thisSeason.setGames(Integer.parseInt(JOptionPane.showInputDialog
               (null, "How many games this season? ", "Total Games",
               JOptionPane.PLAIN_MESSAGE)));
       year = JOptionPane.showInputDialog
               (null, "What year is this season? ", "Year of Season",
               JOptionPane.PLAIN_MESSAGE);

       Display();
   }
    
    
   // set up GUI
   public void Display()
   {
       // Set up container
      Container frameContainer = getContentPane();
      frameContainer.setLayout( new FlowLayout() );

      frameContainer.add(opponentLabel);
      frameContainer.add(opponentText);
      frameContainer.add(againstScoreLabel);
      frameContainer.add(againstScoreText);
      frameContainer.add(forScoreLabel);
      frameContainer.add(forScoreText);
      frameContainer.add( theButton );
      frameContainer.add(resultArea);
      InputHandler handler = new InputHandler();
      theButton.addActionListener( handler );

      // Set application window attributes
      setTitle( year + " Season" );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 500, 150 );
      setVisible( true );

   }
    
   // Private inner class for event handling
   private class InputHandler implements ActionListener
   {
      // Process button event
      public void actionPerformed( ActionEvent event )
      {    
         if ( event.getSource() == theButton
                 && gameNumber < thisSeason.getGames())
         {
             Game newGame = new Game();

             newGame.setOpponent(opponentText.getText());

             
             try  
             {  
                 newGame.setAgainstScore(
                     Integer.parseInt(againstScoreText.getText())); 
             }
             catch( Exception e)  
             {  
                 JOptionPane.showMessageDialog( null, "Opponent's Score is not a" 
                         + " number, please input one. ", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }
             
             try  
             {  
                 newGame.setForScore(
                         Integer.parseInt(forScoreText.getText()));
             }
             catch( Exception e)  
             {  
                 JOptionPane.showMessageDialog( null, "Delta's Score is not a" 
                         + " number, please input one. ", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }
             
             thisSeason.setGameData(newGame, gameNumber);
         
             resultArea.append(thisSeason.getGameData(gameNumber));
             gameNumber++;
         }
         else
             resultArea.append(thisSeason.toString());
      } // end method actionPerformed
   } 
    
   
   
    public static void main(String[] args)
    {
        SportsManager application = new SportsManager();

    }
}
