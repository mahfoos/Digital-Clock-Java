package digitalclock;

import java.util.Date;
import sun.management.Agent;

public class ClockThread extends Thread{
    
    DigitalClock dc;
    String time;
    
    public ClockThread(DigitalClock dc) {
        this.dc = dc;
        start();
    }
    
    public void run (){
        while(true) {
           
            time = "" + new Date();
            dc.jlabClock.setText(time);
            
        }
    }
}
