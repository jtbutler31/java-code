package uniquenumber;

import java.util.Scanner;
import java.util.ArrayList;

public class MyUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		unique();
	}

	public static void unique () {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		
		for(int i = 0; i <= 4; i++) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter an integer between 10 and 100: ");
			int uniqueNumber = input.nextInt();
			
			while (uniqueNumber < 10 || uniqueNumber > 100) {
				
				System.out.print("Enter an integer between 10 and 100: ");
				uniqueNumber = input.nextInt();
			}
			boolean ans = arr.contains(uniqueNumber);
			if (ans == true) {
				continue;
			}
			arr.add(uniqueNumber);
			System.out.print("This is the first time " +uniqueNumber);
			System.out.println(" has been entered");
		}
		
		for (int j = 0; j < arr.size(); j++) {
			
			System.out.print("Unique value " + (j+1));
			System.out.println(" is " + arr.get(j));
		}
	}
}
