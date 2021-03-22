/*
    Awake - Sends a keystroke every minute in an effort to avoid the OS 
        inactivity lock.
    Copyright (C) 2021 Alexandru Dragomirescu

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

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
