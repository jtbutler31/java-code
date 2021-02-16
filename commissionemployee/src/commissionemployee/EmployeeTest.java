package commissionemployee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first name ");
		String firstName = input.nextLine();
		
		System.out.print("Enter last name ");
		String lastName = input.nextLine();
		
		System.out.print("Enter social security number ");
		String socialSecurityNumber = input.nextLine();
		
		System.out.print("Enter gross sales ");
		double grossSales = input.nextDouble();
		
		System.out.print("Enter commission rate ");
		double commissionRate = input.nextDouble();
		
		CommissionEmployee myCommissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
	
		System.out.print(myCommissionEmployee.toString());
	}

}
