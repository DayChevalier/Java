/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;
import javax.swing.JOptionPane;
/**
 *
 * @author Dayton Chevalier
 * This program will calculate various parameters
 * related to health and exercise.
 */
public class HealthParameters
{
    public static void main(String[] args)
    {
        int weight;
        int age;
        int height;
        int feet;
        int inches;
        int elite;
        double bmi;
        String rating;
        String input;
        double heartRate;
        double heartRateMin;
        double heartRateMax;

        do
        {
             
            input = 
                    JOptionPane.showInputDialog ("Please enter your " +
                        "information in the form of hhwwwaae.");     
            
            height = Integer.parseInt(input.substring(0,2));
            weight = Integer.parseInt(input.substring(2,5));
            age = Integer.parseInt(input.substring(5,7));
            elite = Integer.parseInt(input.substring(7,8));
            
        } while (height < 0 && height > 100 && weight < 0 && weight > 500
                    && age < 0 && age > 100);
        
        feet = height / 12;
        inches = height % 12;
        
        bmi = (703 * weight) / (height * height);
       
        if (bmi > 30.00)
        {
           rating = "(Obese)";
        }
        else if (bmi > 25.00)
        {
           rating = "(Overweight)";
        }
        else if (bmi > 18.50)
        {
           rating = "(Normal)";
        }
        else
        {
           rating = "(Underweight)";
        }
       
        heartRate = 217 - (0.85 * age);
       
        if (elite == 1)
        {
           if (age < 30)
           {
               heartRate=-3;
           }
           else if (age <= 54 && age >= 50)
           {
               heartRate=+2;
           }
           else if (age >= 55)
           {
               heartRate=+4;
           }
        }
        
        heartRateMin= heartRate * .60;
        heartRateMax = heartRate * .80;
        
        JOptionPane.showMessageDialog(null, "Age: " + age + "   " 
                + "Height: " + feet + " feet " + inches + " inches " + "    "
                + "Body Mass Index: " + bmi + " " + rating + "  "
                + "Your training heart rate be between " + heartRateMin
                + " and " + heartRateMax);

    }
}
