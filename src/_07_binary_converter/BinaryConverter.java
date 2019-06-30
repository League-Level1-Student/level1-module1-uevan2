package _07_binary_converter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JTextField answer = new JTextField(20);
	JLabel l1 = new JLabel();
	JButton b1 = new JButton();
	
	void setup() {
		f1.add(p1);
		p1.add(answer);
		p1.add(l1);
		p1.add(b1);
		b1.addActionListener(this);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.pack();
		p1.setForeground(Color.black);
		p1.setBackground(Color.black);
		answer.setBackground(Color.DARK_GRAY);
		b1.setBackground(Color.DARK_GRAY);
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
    public static void main(String[] args) {
    	BinaryConverter x = new BinaryConverter();
    	x.setup();
    	

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		answer.getText();
	}
}
