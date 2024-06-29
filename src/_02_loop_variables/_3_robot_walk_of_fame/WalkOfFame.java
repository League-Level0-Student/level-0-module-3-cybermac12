
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(50 );
	
	
		// 2. Make the robot draw a star shape. Hint: angle=144.
int move = 1;
		rob.penDown();
	rob.setSpeed(1000000000);
		int count = 0;
		int c0unt = 0;
		while (c0unt < 100) {
		while (count < 5) {
			rob.move(30);
			rob.turn(144);
			count += 1;		
		}
		move += 2;
		rob.setX(move);
		c0unt += 1;
		count = 0;
		
		}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
