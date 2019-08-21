/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author Dayton Chevalier
 * A rock paper scissors game that keeps track of the wins
 * 
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int games;
      String input;
      char pick;
      boolean choice1;
      boolean choice2;
      int resultant;
      String yourWins = "Your wins: ";
      String compWins = "Computer's wins: ";
      
      // Game number and validation of user choice
      do
      {
          games = Integer.parseInt(
                  JOptionPane.showInputDialog(null, 
                  "Please enter the number of games you would like to play." +
                  "\n" + "(Please enter no more than 8.)" + "\n",
                  "Enter Number of Games.",
                  JOptionPane.PLAIN_MESSAGE));
          if (games < 1 || games > 8)
          {
             choice1 = false;
             JOptionPane.showMessageDialog(null,
                 "Invalid choice - Please re-enter",
                 "Error Notification", 
                 JOptionPane.ERROR_MESSAGE);
          }
          else
          {
             choice1 = true;
          }     
      } while (! choice1 );
      
      // Game and game count down
     while (games > 0)
     {
         do
          {
              input = JOptionPane.showInputDialog(null, 
                      "Please enter your choice." + "\n" +
                      "R for Rock" + "\n" +
                      "P for Paper" + "\n" +
                      "S for Scissors" + "\n",
                      games + " Games Left",
                      JOptionPane.PLAIN_MESSAGE);
              pick = input.charAt(0);
              
              if (pick == 'R' || pick == 'P' || pick == 'S')
              {
                  choice2 = true;
                  resultant = comparison(pick);
                  
                  switch (resultant)
                    {
                        case 1: JOptionPane.showMessageDialog(null,
                                "You Lose!",
                                "Lost", 
                                JOptionPane.PLAIN_MESSAGE);
                            compWins += "*";
                            break;
                        case 2: JOptionPane.showMessageDialog(null,
                                "You Win!",
                                "Won", 
                                JOptionPane.PLAIN_MESSAGE);
                            yourWins += "*";
                            break;
                        case 3: JOptionPane.showMessageDialog(null,
                                "Tie Game!",
                                "Tie", 
                                JOptionPane.PLAIN_MESSAGE);
                            games++; 
                            break;
                    } 
              }
              else
              {
                  choice2 = false;
                  JOptionPane.showMessageDialog(null,
                      "Invalid choice - Please re-enter",
                      "Error Notification", 
                      JOptionPane.ERROR_MESSAGE);
              }
          } while (! choice2 );
               
         games--;
     }
      JOptionPane.showMessageDialog(null, yourWins + "\n" + compWins + "\n",
            "Results", 
            JOptionPane.PLAIN_MESSAGE);

   }  // end main     
    
    
    
    
    
    
   //---------------------------------------------------------
   // This method generates the computer selection and compares them
   public static int comparison(char pick)
   {
      int random;
      char opponent = 'R';
      int yourWins = 0;
      int compWins = 0;
      Random generator = new Random();
       
       
      random = generator.nextInt(3);

      switch (random)
        {
            case 0: opponent = 'R';
                break;
            case 1: opponent = 'P';
                break;
            case 2: opponent = 'S';
                break;
         } 
          
      if ((pick == 'R' && opponent == 'P') || (pick == 'P' && opponent == 'S')
              || (pick == 'S' && opponent == 'R'))
      {
          compWins++;
          return 1;
      }   
      else if ((pick == 'R' && opponent == 'S') || (pick == 'P' && opponent == 'R')
              || (pick == 'S' && opponent == 'P'))
      {
          yourWins++;
          return 2;
      }
      else if (pick == opponent)
      {
          return 3;
      }    
       
      return 3;
   }
    
}
