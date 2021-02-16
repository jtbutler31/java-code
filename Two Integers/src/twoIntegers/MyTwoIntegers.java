package twoIntegers;

import java.util.Scanner;

public class MyTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first integer: "); // prompt for first integer
		int num1 = input.nextInt(); // read first integer from user
		
		System.out.print("Enter your second integer: "); // prompt for second integer
		int num2 = input.nextInt(); // read second integer from user
		
		int sum = num1 + num2; // sum of two integers
		
		System.out.printf("Sum of the first integer and the second integer is %d%n", sum); //display sum
		
		int multiple = num1 * num2; // two integers multiplied
		
		System.out.printf("Your first integer multipled by your second integer is %d%n", multiple); // display multiplied
		
		int subtract = num1 - num2; // num2 subtracted from num1
		
		System.out.printf("Your second integer subracted from the first integer is %d%n", subtract); // display subtraction
		
		int divided = num1 / num2; // division of num1 by num2
		
		System.out.printf("Your first integer divided by your second integer is %d%n", divided); // display division

	}

}
