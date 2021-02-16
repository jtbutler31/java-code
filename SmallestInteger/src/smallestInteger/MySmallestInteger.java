package smallestInteger;

import java.util.Scanner;


public class MySmallestInteger {

	public static void main(String[] args) {
		
		int lowest = Integer.MAX_VALUE;
		int num = 0;
		int numberOfIntegers;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the number of integers you are going to enter: ");
		numberOfIntegers = input.nextInt();
		
		for(int x = 0; x < numberOfIntegers; x++) {
			System.out.print("Enter the "+(x+1)+" of "+numberOfIntegers+" number: ");
			num = input.nextInt();
			
			if (num <= lowest) {
				lowest = num;
			}
		}
		
		System.out.printf("The lowest number is: %d%n", lowest);
	}

}
