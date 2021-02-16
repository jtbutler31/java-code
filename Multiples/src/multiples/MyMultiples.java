package multiples;

import java.util.Scanner;

public class MyMultiples {

	public static void main(String[] args) {
		
		getNumbers();
	}
	
	
	public static boolean isMultiple (int firstInteger, int secondInteger) {
		if ((secondInteger%firstInteger)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void getNumbers() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first integer: "); // prompt for first integer
		int firstInteger = input.nextInt(); // read first integer from user
		
		System.out.print("Enter your second integer: "); // prompt for second integer
		int secondInteger = input.nextInt(); // read second integer from user
	
		boolean result = isMultiple(firstInteger, secondInteger);
		
		if (result == true) {
			System.out.println(secondInteger + " is a multiple of " + firstInteger);	
		}
		else {
			System.out.println(secondInteger + " is not a multiple of " + firstInteger);
		}
		
		System.out.print("Do you want to enter another pair (y/n)? ");
		String again;
		again = input.next();
		
		if(again.equals("y")) {
			getNumbers();
		}
		
		
		
	}

}
