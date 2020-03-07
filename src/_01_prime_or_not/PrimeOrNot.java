package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

public static void main(String[] args) {
	
	boolean check = false;
	
	
	
String number = JOptionPane.showInputDialog(null, "Type a number to determine whether it is prime or not.");
	
	int n = Integer.parseInt(number);
	
	
	for (int i = 2; i<n/2;i++) {
	
	if( n % i == 0) {
		check = true;
	}
	
	}
	
	
	if(check == true) {
		
		JOptionPane.showMessageDialog(null,"Your number is composite");
		
	}
	
	
	else {
		
		JOptionPane.showMessageDialog(null, "Your number is prime");
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}

}
