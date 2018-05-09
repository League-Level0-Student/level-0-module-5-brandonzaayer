package extra;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(
				"Give me a postive number between one and ten thousand, \n then I will test if it is a prime number.");
		int num = Integer.parseInt(number);
		if (num == 2) {
			JOptionPane.showMessageDialog(null, "Your number is prime.");
			return;
		}
		if (num == 1) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
			return;
		}
		int max=(int)Math.sqrt(num)+1;
		int i;
		for (i = 2; i < max; i ++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime, it is evenly devisable by " +i);
				return;
			}

		}

		JOptionPane.showMessageDialog(null, "Your number is prime.");

	}

}
