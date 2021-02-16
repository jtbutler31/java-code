package digitsreverse;

import java.util.Scanner;

public class MyDigitsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseDigits();
		
	}

	public static void reverseDigits () {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to be reversed: ");
		int number = input.nextInt();
		
		String str = Integer.toString(number);
		
		int n = str.length();
		
		char[] arr = new char[n];
		
		for (int i = 0; i < n; i++) {
			
			arr[n - i - 1] = str.charAt(i);
			
			
		}
		
		System.out.print("The number reversed is ");
		
		for (int j = 0; j < n; j++) {
			
			System.out.print(arr[j]);
		}
		
	}
}
