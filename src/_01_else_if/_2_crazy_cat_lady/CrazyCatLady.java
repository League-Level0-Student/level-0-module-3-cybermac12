
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String Frog ="https://www.youtube.com/watch?v=KeONoyEae20" ;
		String video = "https:www.youtube.com/shorts/1nwSxVHJ8Rg" ;
		// 1. Ask the user how many cats they have
		String amountOFCats = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int amountOfCats = Integer.parseInt(amountOFCats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (amountOfCats >= 3) {
			JOptionPane.showMessageDialog(null,"youmight be a crazy cat lady with " + amountOfCats + " cats");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator
		if (amountOfCats <= 2 && amountOfCats > 0) {
	playVideo(video);
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if (amountOfCats == 0) {
			playVideo(Frog);
				}
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

