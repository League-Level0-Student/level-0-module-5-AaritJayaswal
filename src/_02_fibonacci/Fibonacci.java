package _02_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
	
	int a = 0;
	
	int b = 1;
	
	
	JOptionPane.showMessageDialog(null,a);
	JOptionPane.showMessageDialog(null,b);
	
	for (int i = 0; i<10; i++) {
		
		int c = a+b;
				
				JOptionPane.showMessageDialog(null,c);
		a=b;
		b=c;
		
	}
	
	
	
	
	
	
	
	
}

}
