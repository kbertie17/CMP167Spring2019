/*
 * Kira Bertie
 * 3/7/19
 * This program calculates the average.
 */
import java.util.Scanner;

public class kira {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double n;
		double i = 1.0;
		double sum = 0.0;
		double avg;
		
		System.out.println("Enter the number of natural numbers: ");
		n = scnr.nextDouble();
		
		while (i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		
		avg = sum / n;
		
		System.out.println("The average of" + n + " numbers is " + avg);
	}

}
