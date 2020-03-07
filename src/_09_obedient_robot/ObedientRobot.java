package _09_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	static Robot joe = new Robot();
	
	public static void main(String[]args) {
		String color = JOptionPane.showInputDialog(null, "What color would you like?(red, yellow, blue");
		if(color.equals("red")) {
			
			joe.setPenColor(255,0,0);
		}
		if(color.equals("yellow")) {
			
			joe.setPenColor(255,255,0);
		}
		if(color.equals("blue")) {
			joe.setPenColor(0,0,255);
		}
			
		String shape = JOptionPane.showInputDialog(null, "What shape would you like to draw?(square, triangle, or circle)");
		if(shape.equals("square")) {
			drawSquare();
			
		}
		
		if(shape.equals("triangle")) {
			drawTriangle();
			
		}
	
		if(shape.equals("circle")) {
			drawCircle();
			
		}
		
		
	}

	
	public static void drawSquare() {
		
		joe.setSpeed(100);
		joe.penDown();
		for(int  i = 0; i<4;i++) { 
		joe.move(100);
		joe.turn(90);
		}
		
	}
	
	public static void drawTriangle() {
		
		joe.setSpeed(100);
		joe.penDown();
		for(int i = 0; i<3; i++) {
			joe.move(100);
			joe.turn(120);
			
		}
		
	}
	
	public static void drawCircle() {
		
		
		joe.setSpeed(100);
		joe.penDown();
		for(int i = 0; i<180; i++) {
			joe.move(2);
			joe.turn(2);
			
		}
		
	}
	
	
	
}