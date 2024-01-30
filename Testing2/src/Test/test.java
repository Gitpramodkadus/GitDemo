package Test;


	import java.awt.AWTException;
	import java.awt.Robot;
import java.awt.event.InputEvent;
//import java.awt.event.KeyEvent;

//Hello this is my project
	public class test{

	public static void main(String[] args) throws InterruptedException 
	{
	    try 
	    {
	        // Create an instance of Robot
	        Robot robot = new Robot();

	        // Run a loop to simulate key presses at regular intervals
	        while (true) 
	        {
//	            // Simulate pressing the RIGHT ARROW key
//	            robot.keyPress(KeyEvent.VK_RIGHT);
//	            robot.keyRelease(KeyEvent.VK_RIGHT);
//
//	            // Delay for a short duration (adjust as needed)
//	            Thread.sleep(60000); // 60 seconds
//	            
	         // Move the mouse to the top-left corner
                robot.mouseMove(0, 0);

                // Simulate a mouse click
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                // Delay for 1 minute
                robot.delay(60000);
	        }

	    } 
	    catch (AWTException e) 
	    {
	        e.printStackTrace();
	    }
	}
	}


