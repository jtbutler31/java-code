package threeIntegers;

import java.util.Scanner;

public class MyThreeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a scanner to obtain input
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter your first integer: "); // prompt for first integer
		int num1 = input.nextInt(); // read first integer from user
				
		System.out.print("Enter your second integer: "); // prompt for second integer
		int num2 = input.nextInt(); // read second integer from user
		
		System.out.print("Enter your third integer: "); // prompt for third integer
		int num3 = input.nextInt(); // read for third integer from user		
		
		int sum = num1 + num2 + num3; // sum of three integers
		
		System.out.printf("Sum of the three integers is %d%n", sum); //display sum
		
		int average = (num1 + num2 + num3) / 3; // average of three integers
		
		System.out.printf("Average of the three integers is %d%n", average); // display average
		
		int product = num1 * num2 * num3; // product of three integers
		
		System.out.printf("Product of the three integers is %d%n", product); // display product
	
		if (num1 >= num2) {
			if (num2 >= num3) {
				System.out.printf("The smallest is at %d%n", num3);
			}
			if (num3 >= num2) {
				System.out.printf("The smallest is at %d%n", num2);
			}
		}
		
		if (num1 <= num2) {
			if (num1 <= num3) {
				System.out.printf("The smallest is at %d%n", num1);
			}
			if (num3 <= num1) {
				System.out.printf("The smallest is at %d%n", num3);
			}
			
		}
		
		if (num1 >= num2) {
			if (num2 >= num3) {
				System.out.printf("The largest is at %d%n", num1);
			}
			if (num3 >= num1) {
				System.out.printf("The largest is at %d%n", num3);
			}
		}
		
		if (num1 <= num2) {
			if (num2 <= num3) {
				System.out.printf("The largest is at %d%n", num3);
			}
			if (num3 <= num1) {
				System.out.printf("The smallest is at %d%n", num2);
			}
			
		}
		
		
	
	
	}

}
