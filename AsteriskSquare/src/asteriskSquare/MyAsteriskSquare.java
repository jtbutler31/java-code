package asteriskSquare;

import java.util.Scanner;

public class MyAsteriskSquare {

	public static void main(String[] args) {
		
		squareOfAsterisks();

	}
	
	public static void squareOfAsterisks() {
		int side;
	    Scanner input=new Scanner(System.in); 
	
	    System.out.print("Enter the size of the asterik square from 1-20: ");
	    side = input.nextInt();
	    for (int row = 1; row <= side; row++){
	
	    	for(int column = 1; column <= side; column++){
			  System.out.print("*");
		    }
		    System.out.print("\n");
		  	}
	
	}
}


