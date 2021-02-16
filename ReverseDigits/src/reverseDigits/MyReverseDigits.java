package reverseDigits;

import java.util.Scanner;

public class MyReverseDigits {

	public static void main(String[] args) {
		
		reverseTheDigits();
	}
	
	public static void reverseTheDigits() {
	
		int reverse = 0;
		
		System.out.print("Enter a number to reverse: ");
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();

	    while(num != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + num%10;
	      num = num/10;
	    }

	    System.out.println("Reverse of the number is " + reverse);
	  }
}
