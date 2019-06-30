package _06_duck;

import javax.swing.JOptionPane;

public class Dolphin {
	
	int numberOfFriends=0;
	String name="uevan";
	
	Dolphin(int numberOfFriends,String name){
		this.numberOfFriends=numberOfFriends;
		this.name=name;
	}
	public void splash() {
		JOptionPane.showMessageDialog(null, "splash");
	}
	public void whistle() {
		JOptionPane.showMessageDialog(null, name+" whistled!");
	}
	
}
