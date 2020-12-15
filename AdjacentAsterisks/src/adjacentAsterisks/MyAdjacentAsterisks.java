package adjacentAsterisks;

import java.util.Scanner;

public class MyAdjacentAsterisks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five integers between 1 and 30 seperated by a space and then press enter: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		for (int x = 1; x <= num1; x++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		for (int x = 1; x <= num2; x++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		for (int x = 1; x <= num3; x++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		for (int x = 1; x <= num4; x++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		for (int x = 1; x <= num5; x++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
	}

}
