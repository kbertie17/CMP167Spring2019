/*
 * Kira Bertie
 * 3/7/19
 * This program prints out the first nth power of two using  a for loop. 
 */

import java.util.Scanner;

public class powers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter value of n: ");
		int n = scnr.nextInt();
		
		int power = 1;
		
		for (int i = 2; i <= n; i++) {
			System.out.println(power);
			power = power * 2;
		}		
	}
} 