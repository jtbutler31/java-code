package evenNumbers;

import java.util.Scanner;

public class MyEvenNumbers {

	public static void main(String[] args) {
		
		getNumbers();
	}
	
		
		public static boolean isEven (int firstInteger) {
			if ((firstInteger%2)==0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void getNumbers() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your integer to check: "); // prompt for first integer
			int firstInteger = input.nextInt(); // read first integer from user
			
			
			boolean result = isEven(firstInteger);
			
			if (result == true) {
				System.out.println(firstInteger + " is even.");	
			}
			else {
				System.out.println(firstInteger + " is Odd.");
			}
			
			System.out.print("Do you want to enter another number (y/n)? ");
			String again;
			again = input.next();
			
			if(again.equals("y")) {
				getNumbers();
			}
		}
}

