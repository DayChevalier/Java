package program4;
import javax.swing.JOptionPane;
/**
 *
 * @author Dayton Chevalier
 * The driver for a Java class that will store basic
 * parameters based on the calories burned for working out.
 */
public class HealthLogDriver
{

    public static void main(String[] args)
    {
      HealthLog log = new HealthLog();
      double cals, max, min, bmi, calories;
      String classification;
      boolean valid = false;

      while (valid == false)
      {   
          // Input age 
          valid = log.validateAge(Integer.parseInt(JOptionPane.showInputDialog
                  (null, "Enter your age: ", "Age",
                  JOptionPane.PLAIN_MESSAGE)));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog
                  (null, "Please enter an age between 13 and 70.","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }
      valid = false;
      
      
      while (valid == false)
      {   
          // Input height 
          valid = log.validateHeight(Integer.parseInt(JOptionPane.
                  showInputDialog(null, "Enter your height in inches: ",
                  "Height",JOptionPane.PLAIN_MESSAGE)));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog
                  (null, "Please enter a height a resonable height.","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }
      valid = false;
      
      
      while (valid == false)
      {   
          // Input weight
          valid = log.validateWeight(Integer.parseInt(JOptionPane.
                  showInputDialog(null, "Enter your weight in pounds: ",
                  "Weight",JOptionPane.PLAIN_MESSAGE)));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog
                  (null, "Please enter a realistic weight.","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }
      valid = false;
      
      
      while (valid == false)
      {   
          // Input gender
          valid = log.validateGender((JOptionPane.
                  showInputDialog(null, "Enter your gender in form of m or f: ",
                  "Gender",JOptionPane.PLAIN_MESSAGE)).charAt(0));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog
                  (null, "Please enter a gender by way of m or f","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }
      valid = false;
      
      
      while (valid == false)
      {   
          // Input type
          valid = log.validateType(JOptionPane.
                  showInputDialog(null, "Enter your work out type, " + 
                  "walking or running: ", "Exercise type",
                  JOptionPane.PLAIN_MESSAGE));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog(null,
                  "Please enter either walking or running.","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }     
      valid = false;
      
      
      while (valid == false)
      {   
          // Input speed
          valid = log.validateSpeed(Integer.parseInt(JOptionPane.
                  showInputDialog(null, "Enter your speed in mph: ",
                  "Speed",JOptionPane.PLAIN_MESSAGE)));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog
                  (null, "Please enter a realistic speed.","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }
      valid = false;
      
      
      while (valid == false)
      {   
          // Input time
          valid = log.validateTime(Integer.parseInt(JOptionPane.
                  showInputDialog(null, "Enter your total time for " +
                  "working out: ", "Speed",JOptionPane.PLAIN_MESSAGE)));
          
          if (valid == false)
          {
              JOptionPane.showMessageDialog
                  (null, "Please enter a time 3 hours or less.","Error",
                  JOptionPane.ERROR_MESSAGE);
          }
      }
      
      cals = log.caloriesBurned();
      max = log.maxHeart();
      min = log.minHeart();
      bmi = log.bodyMass();
      classification = log.bmiClass(bmi);
      calories = log.caloriesNeeded();
      
      JOptionPane.showMessageDialog(null,
              "Calories burned: " + cals + "\n"
              + "Maximum heartrate: " + max + "\n" 
              + "Minimum heartrate: " + min + "\n"
              + "Body Mass Index: " + bmi + " \n"
              + "BMI Class: " + classification + "\n"
              + "Minimum calorie needs: " + calories + "\n", "Results",
              JOptionPane.PLAIN_MESSAGE);
          
    }
}
