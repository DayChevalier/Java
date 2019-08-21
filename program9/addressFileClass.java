package program9;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayton Chevalier
 * A class that will act as a "data manager"
 * for the list of zip code information. 
 */
public class addressFileClass
{
    String address;
    String info;
    String[] list = new String[1500];
    int listSize;
    
    public addressFileClass()
    {
    setAddress("00000");
    setInfo("Null");
    setListSize(0);
    }
    
    
    public void setAddress(String inputAddress)
    {
        address = inputAddress;
    }
    
    public void setInfo(String inputInfo)
    {
        info = inputInfo;
    }   
     
    public void setListSize(int inputSize)
    {
        listSize = inputSize;
    }
    
    public void setList(String fileName)
    {
        try
        {
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);
            int x=0;
            while (inputFile.hasNext())
            {
                list[x] = inputFile.nextLine();
                x++;
            }
            setListSize(x);
            inputFile.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog( null, "Input/Ouput Error." + "\n"
                    + "File not found or in unexpected format.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);        
        } 

    }
    
    
    
    
    
    
    public String getAddress()
    {
        return address;
    }
    
    public String getInfo()
    {
        return info;
    }   
    
    public int getListSize()
    {
        return listSize;
    }
     
    public String getList()
    {
        String fullList = "";
        int x = getListSize();
        
        while (x >= 0)
        {
            fullList += list[x];
            x--;
        }
        
        return fullList;
    }  
    
    
    
    
    
    
    public String search()
    {
        String foundString =""; 
        for (int n = 0; n < listSize; n++)
        {      
            if (list[n].contains(address))
            {
                foundString = list[n];
            }
        }
        
        return foundString;
    }
}