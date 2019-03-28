/* Kira Bertie
 * 3/28/19
 *  */

package aaaa;

public class DMV {
	public static void generateDL(int age, boolean testPass) {
		
		if (testPass) {
			if (age < 17) {
				System.out.println("Driver's liscence cannot be generated");
			}
			else if (age >= 17) {
				System.out.println("Driver's liscense generated");
			}
		}
		if (!testPass) {
			System.out.println("Driver's liscence cannot be generated");
		}
	}
	public static int ExpirationDate(int yearGenerated) {
		return yearGenerated + 10; 
	}
	
	public static void main(String[] args) {
		generateDL(18, false);
		System.out.print(ExpirationDate(2007));
	}
}

