package awake;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.Thread;

public class Awake {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        
        while (true) {
            robot.keyPress(KeyEvent.VK_F24);
            robot.keyRelease(KeyEvent.VK_F24);
            Thread.sleep(60000);
        }
        
    }

}
