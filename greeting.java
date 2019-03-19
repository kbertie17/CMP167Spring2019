/*
Kira Bertie
3/19/19
This program asks the user for a name. 
*/

package aaaa;

import java.util.Scanner;

public class greeting {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		
		String userName;
		String cont;
		
		System.out.println("Would you like to start? Y/N");
		cont = scnr.next(); 
		
		while (cont.charAt(0) == 'Y') {
			System.out.println("Enter name: ");
			userName = scnr.next(); 
			
			if ((userName.charAt(userName.length() - 1) == 'e') || (userName.charAt(userName.length() - 1) == 'a')) {
				System.out.println("Miss " + userName);
			}
			
			else {
				System.out.println("Mister " + userName);
			}
			
			System.out.println("Would you like to proceed? Y/N");
			cont = scnr.next();
		}
 
		System.out.println("Goodbye.");

	}

}
