package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String pFlavor = JOptionPane.showInputDialog("what flavor of popcorn do you want");
		Popcorn x = new Popcorn(pFlavor);
		Microwave y = new Microwave();
		y.putInMicrowave(x);
		String cookTime = JOptionPane.showInputDialog("how long do you want to cook the popcorn");
		int time = Integer.parseInt(cookTime);
		y.setTime(time);
		y.startMicrowave();
		x.eat();
	}
}
