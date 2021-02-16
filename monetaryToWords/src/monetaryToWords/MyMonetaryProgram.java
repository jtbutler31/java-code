package monetaryToWords;

import java.util.Scanner;

public class MyMonetaryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter check amount: "); 
		double number = input.nextDouble(); 
		
		String strNumber = String.valueOf(number);
		
		String[] strArray = strNumber.split("\\.");
		
		int dollars = Integer.parseInt(strArray[0]);
		int intCents = Integer.parseInt(strArray[1]);
		
		String hundred = "/100";
		String cents = " and " + strArray[1] + hundred;
		
		System.out.println(converter(dollars) + cents);
		
		
		
		
		
	
		
	}
	
	private static final String[] tensNames = {
			"",
			" ten",
			" twenty",
			" thirty",
			" forty",
			" fifty",
			" sixty",
			" seventy",
			" eighty",
			" ninety"
	};
	
	private static final String[] numNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
	};
	
	public static String converter(int number) {
		
		String str1;
		
		if (number % 100 < 10) {
			str1 = numNames[number % 100];
			number /= 100;
		}
		else {
			str1 = numNames[number % 10];
			number /=10;
			
			str1 = tensNames[number % 10] + str1;
			number /= 10;
		}
		if (number ==0) {
			return str1;
		}
		return numNames[number] + " hundred" + str1;
	}
	
}
