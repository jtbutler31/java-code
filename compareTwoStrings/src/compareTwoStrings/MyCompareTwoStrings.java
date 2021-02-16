package compareTwoStrings;

import java.util.Scanner;

public class MyCompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		compare();
		
	}
	
	public static void compare() {

		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter first string: ");
		String str1 = input.nextLine();
		
		System.out.print("Enter second string: ");
		String str2 = input.nextLine();
		
		System.out.print("Enter starting index for first string: ");
		int str1Index = input.nextInt();
		
		System.out.print("Enter starting index for second string: ");
		int str2Index = input.nextInt();
		
		System.out.print("Enter number of characters to compare: ");
		int numToCompare = input.nextInt();
		
		boolean match1 = str1.regionMatches(true, str1Index, str2, str2Index, numToCompare);
		
		System.out.println(match1);
		
		
	}
}
