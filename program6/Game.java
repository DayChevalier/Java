package program6;

/**
 *
 * @author Dayton Chevalier
 * Store games results for one game
 * 
 */
public class Game {
    String opponent;
    int forScore;
    int againstScore;
    
    public void setOpponent(String school)
    {
        opponent = school;
    }
    
    public void setAgainstScore(int score)
    {
        againstScore = score;
    }   
     
    public void setForScore(int score)
    {
        forScore = score;
    }  

    
    public String getOpponent()
    {
        return opponent;
    }
    
    public int getForScore()
    {
        return forScore;
    }
        
    public int getAgainstScore()
    {
        return againstScore;
    }
    
    public String toString()
    {
        return "Delta: " + forScore + "   " + opponent + ": "
                + againstScore + "\n";
    }
}
