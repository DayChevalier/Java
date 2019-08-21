/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program7;
/**
 *
 * @author Dayton Chevalier
 */
public class Message {
    private String[] countryArray = {"France", "Great Briton", "Canada",
        "Japan", "Russia", "Germany", "Australia", "Mexico"};
    private String[] codeArray = {"FR", "GB", "CA", "JA", "RU", "GE",
        "AU", "MX"};
    private String inputMessage;
    private String outputMessage;
    private String recieverCode;
    private String recieverCountry;
    
    public Message()
    {
        inputMessage = "";
        outputMessage = "";
        recieverCode = "";
        recieverCountry = "";
    }
            
    
    
    public void setInputMessage(String input)
    {
        inputMessage = input;
    }
    
    public void setOutputMessage(String input)
    {
        outputMessage = input;
    }
    
    public void setRecieverCode(String input)
    {
        recieverCode = input;
    }
    
    public void setRecieverCountry(String input)
    {
        recieverCountry = input;
    }
    
    
    
    public String getInputMessage()
    {
        return inputMessage;
    }
    
    public String getOutputMessage()
    {
        return outputMessage;
    }
    
    public String getRecieverCode()
    {
        return recieverCode;
    }
    
    public String getRecieverCountry()
    {
        return recieverCountry;
    }
    
    
    
    public boolean validateCode(String input)
    {
        boolean valid = false;
        for(int index = 0; index <= 7; index++)
        {
            if (input.equals(codeArray[index]))
            {
                valid = true;
            }
        }
        return valid;
    }
    
    
    public void encode()
    {
        String input = inputMessage.toUpperCase();
        char[] charArray = input.toCharArray();
        
        int length = charArray.length;
        for(int i=0; i<length; i++)
        {
            if (charArray[i] <= 77)
                charArray[i] += 13;
            else
                charArray[i] -= 13;
        }
        setOutputMessage(new String(charArray));
    }
    
    
    public void translate()
    {
        for(int index = 0; index <= 7; index++)
        {
            if (recieverCode.equals(codeArray[index]))
            {
                setRecieverCountry(countryArray[index]);
            }
        }
    }
}
