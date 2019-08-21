package program4;

/**
 *
 * @author Dayton Chevalier
 * A Java class that will store basic parameters
 * based on the calories burned for working out.
 */
public class HealthLog {
    
    private int age;
    private int height;
    private int weight;
    private char gender;
    private String type;
    private int speed;
    private int time;
    
    public HealthLog()
    {
        age = 0;
        height = 0;
        weight = 0;
        gender = 'm';
        type = "walking";
        speed = 0;
        time = 0;
    }
            
    public void setAge(int input)
    {
        age = input;
    }
    
    public void setHeight(int input)
    {
        height = input;
    }
    
    public void setWeight(int input)
    {
        weight = input;
    }
    
    public void setGender(char input)
    {
        gender = input;
    }
    
    public void setType(String input)
    {
        type = input;
    }
    
    public void setSpeed(int input)
    {
        speed = input;
    }
    
    public void setTime(int input)
    {
        time = input;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public char getGender()
    {
        return gender;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int setTime()
    {
        return time;
    }
    
    public boolean validateAge(int input)
    {
        boolean valid;
        if (input >= 13 && input <= 70)
        {
            valid = true;
            setAge(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public boolean validateHeight(int input)
    {
        boolean valid;
        if (input >= 40 && input <= 100)
        {
            valid = true;
            setHeight(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public boolean validateWeight(int input)
    {
        boolean valid;
        if (input >= 75 && input <= 300)
        {
            valid = true;
            setWeight(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public boolean validateGender(char input)
    {
        boolean valid;
        if (input == 'm' || input == 'f')
        {
            valid = true;
            setGender(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public boolean validateType(String input)
    {
        boolean valid;
        if (input.equals("walking") || input.equals("running"))
        {
            valid = true;
            setType(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public boolean validateSpeed(int input)
    {
        boolean valid;
        if (input >= 1 && input <= 27)
        {
            valid = true;
            setSpeed(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public boolean validateTime(int input)
    {
        boolean valid;
        if (input >= 10 && input <= 180)
        {
            valid = true;
            setTime(input);
        }
        else
            valid = false;
        return valid;
    }
    
    public double caloriesNeeded()
    {
        double calories = 0;
        
        if (gender == 'm')
        {
            calories = 66.5+(13.75*(weight*.453592))+
                    (5.003*(height*2.54))-(6.775*age);
        }
        else
        {
            calories = 655.1+(9.563*(weight*.453592))+
                    (1.850*(height*2.54))-(4.676*age);  
        }
        
        return calories;
    }
    
    public double bodyMass()
    {
        double bmi;
        
        bmi = (703*weight)/(Math.pow(height,2));
        
        return bmi;
    }
    
    public String bmiClass(double bmi)
    {
        String classification = "Null";
        
        if (bmi < 18.5)
            classification = "underweight";
        else if (bmi <= 24.99)
            classification = "normal";
        else if (bmi <= 29.99)
            classification = "overweight";
        else if (bmi >= 30)
            classification = "obese";
        
        return classification;
    }
    
    public double caloriesBurned()
    {
        double burned = 0;
        
        if (type.equals("running"))
            burned = weight*.75*(speed*time);
        else
            burned = weight*.53*(speed*time);
        
        return burned;
    }
    
    public double minHeart()
    {
        double minimum = 0;
        
        minimum = (217*.6)-(.85*age);
        
        return minimum;
    }
    
    public double maxHeart()
    {
        double maximum = 0;
        
        maximum = (217*.8) - (.85*age);
        
        return maximum;
    }
}

