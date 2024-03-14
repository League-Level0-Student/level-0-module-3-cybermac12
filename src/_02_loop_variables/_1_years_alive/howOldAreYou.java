package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class howOldAreYou {
	public static void main(String[] args) {
	
		String whenTheyWereborn = JOptionPane.showInputDialog("what year were you born");
		
		int curYear = 2024;
		int theYear = Integer.parseInt(whenTheyWereborn);
	
	int age = curYear - theYear;
	
		JOptionPane.showMessageDialog(null," Are you " + age + " years old");
	
	}
}
