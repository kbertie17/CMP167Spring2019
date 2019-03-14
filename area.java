
/* Kira Bertie
 * 3/12/19
 * This program calculates area. */

import java.util.Scanner;

public class area {
	//Scanner object
	Scanner scnr = new Scanner(System.in);
	/*
	 * rectArea: void
	 * inputs: width & length
	 * process: area = width*length
	 * output: area 
	 */
	public static int getrectArea(int width, int length) {
		return width * length;
	}
	public static void rectArea() {
		Scanner scnr = new Scanner(System.in);

		int length;
		int width;
		int area;
		//input
		System.out.println("Enter width: ");
		width = scnr.nextInt();
		System.out.println("Enter length: ");
		length = scnr.nextInt();
		//process/calculations
		area = width * length;
		//output
		System.out.println("The area is " + area);
	}

	/*
	 * circArea: void
	 * input: radius
	 * process: pi * r^2
	 * output; area
	 */
	public static int getcircArea(double radius) {
		return Math.PI * Math.pow(radius, 2.0);
	}
	public static void circArea() {
		Scanner scnr = new Scanner(System.in);
		
		double radius;
		double area;
		//input
		System.out.println("Enter radius: ");
		radius = scnr.nextInt();
		//process/calculations
		area = Math.PI * Math.pow(radius, 2.0);
		//output
		System.out.println("The area is: " + area);
	}
	
	/*triArea: void
	 * inputs: height & base
	 * process: (b * h) / 2
	 * output: area
	 */
	public static int gettriArea(double height, double base) {
		return (base * height) / 2;
	}
	public static void triArea() {
		Scanner scnr = new Scanner(System.in);
		
		double height;
		double base;
		double area;
		//input
		System.out.println("Enter height: ");
		height = scnr.nextInt();
		System.out.print("Enter base: ");
		base = scnr.nextInt();
		//process/calculations
		area = (base * height) / 2;
		//output
		System.out.println("The area is: " + area);
	}
	//for debugging
	public static void main(String[] args) {
		rectArea(); //function call/invocation
		circArea();
		triArea();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter width and length: ");
		int width = scnr.nextInt();
		int length = scnr.nextInt();
		int area = getrectArea(width, length);
		System.out.println("Area: " + area);
		
		System.out.println("Enter radius: ");
		double radius = scnr.nextDouble();
		int area = getcircArea(radius);
		System.out.println("Area: " + area);
		
		System.out.println("Enter height and base: ");
		double height = scnr.nextDouble();
		double base = scnr.nextDouble(); 
		double area = gettriArea(height, base);
		System.out.println("Area: " + area);
		
	}
}


