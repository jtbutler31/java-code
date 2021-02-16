package Date;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Date myDate = new Date();
		
		System.out.print("Enter the month, day and year in the form xx xx xxxx and hit enter: ");
		int month = input.nextInt();
		myDate.setMonth(month);
		int day = input.nextInt();
		myDate.setDay(day);
		int year = input.nextInt();
		myDate.setYear(year);
		
		myDate.displayDate();
		
		System.out.print("Enter a new year: ");
		year = input.nextInt();
		myDate.setYear(year);
		
		myDate.displayDate();
		
		System.out.print("Enter a new day: ");
		day = input.nextInt();
		myDate.setDay(day);
	
		myDate.displayDate();
		
		System.out.print("Enter a new month: ");
		month = input.nextInt();
		myDate.setMonth(month);
		
		myDate.displayDate();
		
		
	}

}
