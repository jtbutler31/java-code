package pigLatinProgram;

import java.util.Scanner;

public class MyPigLatinProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pigLatin();
	}

	public static void pigLatin() {
		
		Scanner input = new Scanner(System.in);
		String[] tokens;
		
		System.out.print("Enter a string to be translated: ");
		String str1 = input.nextLine();
		tokens = str1.split(" ");
		
		String str2 = "";
		
		for(String token : tokens) {
			str2 += token.substring(1) + token.substring(0, 1) + "ay ";
		}
		
		System.out.println(str2);
		
	}
}
