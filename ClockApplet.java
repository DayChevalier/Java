import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*; 

/**
 *
 * @author Dayton Chevalier
 * This applet creates two threads that display current time based on the
 * system clock of the machine the applet is running on.  The threads can
 * be stopped and started with buttons 
 */
public class ClockApplet extends Applet
{
    private    Panel     clock1Panel, mainPanel;
    private    Label     clock1;
    private    ClockThread   clockTicker1;

    // Set up GUI
    public void init() 
    {
        // Format applet window
        setLayout(new FlowLayout(FlowLayout.CENTER,4,1));
        
        // Set labels and buttons
        clock1 = new Label("EST: 00:00:00.00", Label.CENTER);
        
        // Set clock 1 panel
        clock1Panel = new Panel();
        clock1Panel.setLayout(new BorderLayout(2,2));
        clock1Panel.add("East",clock1);

        // Build main GUI 
        mainPanel = new Panel();
        mainPanel.setLayout(new BorderLayout(2,2));
        mainPanel.add("North",clock1Panel);
        add(mainPanel);
        
        //Start clock thread
        handleStart();
    }

    // Method to start a clock thread
    private void handleStart() 
    {
        clockTicker1 = new 
        ClockThread(clock1,"EST");
        clockTicker1.start();
    }
}

// This is the main clock thread
class ClockThread extends Thread 
{
    private Label   clock;
    private boolean amRunning;
    private String timeZone;
    
    // Constructor:  Determine time zone to use
    ClockThread(Label theLabel, String timeZone) 
    {
        this.clock = theLabel;
        this.timeZone = timeZone;
    }

    // Defines execution of one clock thread
    public void run() 
    {
        amRunning = true;
        while (true)
            if (amRunning) 
            {
                oneTick();                   // Access current clock time
                try {
                    this.sleep(20);          // Wait 0.02 seconds
                } catch (Exception e) {;}
            }
    }

    // Action for each clock tick. Accesses system time and displays it
    private void oneTick() 
    {
        GregorianCalendar gc = 
        new GregorianCalendar(TimeZone.
        getTimeZone(timeZone));
        int      h = gc.get(Calendar.HOUR);
        int      m = gc.get(Calendar.MINUTE);
        int      s = gc.get(Calendar.SECOND);
        String  hms = leadingDigit(h," ")+":" +
        leadingDigit(m,"0")+":" +
        leadingDigit(s,"0");
        clock.setText(hms);
    }

    // To covert an integer into a two-character digit 
    private String leadingDigit(int n, String leader) 
    {
        if (n<10)
            return leader+n;
        return ""+n;
    }
} 