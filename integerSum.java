package integerSum;

import java.util.Scanner;

public class integerSum {
    public static void main(String[] args) {
        Scanner scnr = newScanner(System.in);
        
        int userInt; 
        int i = 0;
        int sumInt = 0;
        
        System.out.println("Enter the number of integers: ");
        userInt = scnr.nextInt();
        
        while (i < userInt) {
            i = i + 1;
            sumInt = sumInt + i;
        }
        
        System.out.print("The sum of " + userInt + " integers is " + sumInt);
    }
}