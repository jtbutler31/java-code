package hourlyemployee;

import java.util.Scanner;


public class HourlyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first name ");
		String firstName = input.nextLine();
		
		System.out.print("Enter last name ");
		String lastName = input.nextLine();
		
		System.out.print("Enter social security number ");
		String socialSecurityNumber = input.nextLine();
		
		System.out.print("Enter hours worked ");
		double hours = input.nextDouble();
		
		System.out.print("Enter pay per hour ");
		double wage = input.nextDouble();
		
		HourlyEmployee myHourlyEmployee = new HourlyEmployee(firstName, lastName, socialSecurityNumber, hours, wage);
		
		System.out.print(myHourlyEmployee.toString());
	
	}

}
