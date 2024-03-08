package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {

		String HIHIHI = JOptionPane.showInputDialog("Are you Happy?");


		if (HIHIHI.equals("Yes")) {
			JOptionPane.showMessageDialog(null,"Keep doing what you are doing");
		}

		else if (HIHIHI.equals("No")) {
			String noo = JOptionPane.showInputDialog("Do you want to be happy");

			if (noo.equals ("No")) {
				JOptionPane.showMessageDialog(null,"Keep doing what you are doing");
			}
			if (noo.equals ("Yes")) {
				JOptionPane.showMessageDialog(null,"You should change something");		
			}
		
		}



	}
}
