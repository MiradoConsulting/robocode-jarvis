import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Jarvis - a robot by (your name here)
 */
public class Jarvis extends Robot
{
	int count = 0;

	/**
	 * run: Jarvis's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.white, Color.red,Color.black); // body,gun,radar
		
		

		// Robot main loop
		while(true) {
			if (count > 11) {
				turnRight(360);
			}
			
			count++;
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		count = 0;
		turnRight(e.getBearing());
		ahead(e.getDistance() - 140);
		fire(3);
		scan();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
