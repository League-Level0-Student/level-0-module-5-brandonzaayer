package extra;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		String fibon = JOptionPane.showInputDialog("How many numbers of Fibonacci would you like printed.");
		int acci = Integer.parseInt(fibon);
		int num1 = 1;
		int num2 = 1;
		for (int i = 1; i < acci; i++) {
			int sum = num1 + num2;

			if (sum < 0) {
				return;
			}
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(sum);
			num1 = num2;
			num2 = sum;

		}
	}
}
