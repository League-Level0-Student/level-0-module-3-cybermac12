
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
	int count = 0;
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		while(count < 11) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("guess a number 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int Guess = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (Guess == random) {	
				JOptionPane.showMessageDialog(null,"Great job winning hope you had fun!!");
				System.exit(0);
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			
			// 7. if the guess is high
			else if (Guess > random) {
				JOptionPane.showMessageDialog(null,"too high try again ");	
			}
				// 8. Tell them it's too high
			
			// 9. if the guess is low
			else if (Guess <random) {
				JOptionPane.showMessageDialog(null,"too low try again ");	
			}
			count += 1;
			// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null,"You lose ");	
	}

}


