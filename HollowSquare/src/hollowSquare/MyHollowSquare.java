package hollowSquare;

import java.util.Scanner;

public class MyHollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int side;
	    Scanner input=new Scanner(System.in); 
	
	    System.out.print("Enter the size of the asterik square from 1-20: ");
	    side = input.nextInt();
	    for (int row = 1; row <= side; row++){
	    	System.out.print("*");
	    }	
	    System.out.print("\n");
	    for (int column = 1; column <= side - 2; column++){
	    	for (int row = 1; row <= side; row++){
	    		if(row == 1 || row == side){
	    			System.out.print("*");
	    		}else{
	    			System.out.print(" ");
	    		}
	    }
	    
	    System.out.print("\n");
	    }
	
	    for(int row = 1; ((side != 1) && (row <= side)); row++){
		  System.out.print("*");
	    }
	    System.out.print("\n");
	  	}
}
