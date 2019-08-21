package program8;

/**
 *
 * @author Dayton Chevalier
 * an object to hold data about game settings
 */
public class preferencesObject
{
    String name;
    String complexity;
    int speed;
    boolean emails;
    int color;
    
    public preferencesObject()
    {
    name = "Player1";
    complexity = "Beginner";
    speed = 0;
    emails = true;
    color = 0;
    }
    
    
    public void setName(String inputName)
    {
        name = inputName;
    }
    
    public void setComplexity(int level)
    {
        if (level == 0)
            complexity = "Beginner";
        else if (level == 1)
            complexity = "Experienced";
        else if (level == 2)
            complexity = "Advanced";
        else
            complexity = "Expert";
    }   
     
    public void setSpeed(int inputSpeed)
    {
        speed = inputSpeed;
    }  
    
    public void setEmails(boolean inputEmails)
    {
        emails = inputEmails;
    }
    
    public void setColor(String inputColor)
    {
        if (inputColor.equals("Blue"))
            color = 0;
        else if (inputColor.equals("Red"))
            color = 1;
        else if (inputColor.equals("Green"))
            color = 2;
        else if (inputColor.equals("Yellow"))
            color = 3;
        else if (inputColor.equals("purple"))
            color = 4;
    } 
    

    
    public String getName()
    {
        return name;
    }
    
    public String getComplexity()
    {
            return complexity;
    }   
     
    public int getSpeed()
    {
        return speed;
    }  
    
    public boolean getEmails()
    {
        return emails;
    }
    
    public String getColor()
    {
        if (color == 0)
            return "Blue";
        else if (color == 1)
            return "Red";
        else if (color == 2)
            return "Green";
        else if (color == 3)
            return "Yellow";
        else
            return "purple";
    } 
    
    
    
    
    
    
    public String toString()
    {
        return "Name: " + getName() + " Difficulty: " + getComplexity() + "\n"
                + "Speed: " + getSpeed() + " Recieving Emails: " + getEmails()
                + "\n" + "Color of Pieces: " + getColor();
    }
}