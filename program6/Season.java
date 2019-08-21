package program6;


/**
 *
 * @author Dayton Chevalier
 * Store game results for an entire season
 * 
 */
public class Season {
    int games;
    Game[] gameData;
    int wins = 0;
    int losses = 0;
    
    public void setGames(int gameTotal)
    {
        games = gameTotal;
    }
    
    public void setWins(int victories)
    {
        wins = victories;
    }
        
    public void setLosses(int failures)
    {
        losses = failures;
    }
    
    public void setGameData(Game results, int currentGame)
    {
        gameData = new Game[games];
        gameData[currentGame] = results;
        
        
        if (gameData[currentGame].againstScore < gameData[currentGame].forScore)
        {
            int won;
            won = getWins();
            setWins(won+1);
        }
        else
        {
            int lost;
            lost = getLosses();
            setLosses(lost+1);
        }
    }

    public int getGames()
    {
        return games;
    }
    
    public int getWins()
    {
        return wins;
    }
        
    public int getLosses()
    {
        return losses;
    }
    
    public String getGameData(int index)
    {
        return "Game: " + (index+1) + "\n" + gameData[index].toString() + "\n";

    }
    
    public String toString()
    {
        
        return "Record: " + wins + " win(s), "
                + losses + " loss(es)" + "\n";
    }
}
