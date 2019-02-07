package week2;
/*
 * Author: Kira Bertie
 * Created: 2/7/2019
 * Description: This program calculates the average of three given numbers. 
 */

import java.util.Scanner;


public class kira {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double num1; 
		double num2;
		double num3;
		double avg; 
		
		System.out.println("Input three numbers: ");
		num1 = scnr.nextDouble();
		num2 = scnr.nextDouble();
		num3 = scnr.nextDouble();
		avg = (num1 + num2 + num3) / 3;
		System.out.println("The average is: " + avg); 
		
	}

}
