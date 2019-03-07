/*
 * Kira Bertie
 * 3/7/19
 * This program calculates the factorial of 'n'. 
 */

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int n;
		int i = 1;
		int factorial = 1;
		
		System.out.println("Enter a value for \'n\': ");
		n = scnr.nextInt();
		
		while (i <= n) {
			factorial = factorial * i;
			i = i + 1;
		}
		
		System.out.println("The factorial of " + n + " numbers is " + factorial);
	}
}

