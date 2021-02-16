package timetwo;

import java.util.Scanner;

public class Time2Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds2Midnight;
		
		Scanner input = new Scanner(System.in);
		Time2 myTime2 = new Time2();
		
		System.out.print("Enter number of hours past midnight: ");
		int hour = input.nextInt();
		myTime2.setHour(hour);
		
		System.out.print("Enter number of minutes past midnight: ");
		int minute = input.nextInt();
		myTime2.setMinute(minute);
		
		System.out.print("Enter number of seconds past midnight: ");
		int second = input.nextInt();
		myTime2.setSecond(second);
		
		System.out.println("Total seconds from midnight is " + myTime2.toString());
		
	}
} 

