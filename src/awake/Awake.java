package awake;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Awake {

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        
        ScheduledExecutorService scheduler = 
                Executors.newScheduledThreadPool(1);
        
        Runnable runCmd = new Runnable() {
            public void run() {
                robot.keyPress(KeyEvent.VK_F24);
                robot.keyRelease(KeyEvent.VK_F24);
                
            }  
        };
        ScheduledFuture<?> handle = 
                scheduler.scheduleAtFixedRate(runCmd, 60, 60, TimeUnit.SECONDS);
    }

}
