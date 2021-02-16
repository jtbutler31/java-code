package hourlyemployee;

public class HourlyEmployee extends Employee{

	private double hours;
	private double wage;
	
	public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		if (hours < 0.0 || hours > 168) 
		throw new IllegalArgumentException ("Hours must be greater than or equal to 0.0 and less than 168");
	if (wage < 0.0) 
		throw new IllegalArgumentException ("Wage must be non negative");
	
	this.hours = hours;
	this.wage = wage;
	
}

public void setHours (double hours) {
	if (hours < 0.0 || hours > 168) 
	throw new IllegalArgumentException ("Hours must be greater than or equal to 0.0 and less than 168");
	this.hours = hours;
}

public double getHours() {return hours;}
public void setWage(double wage) {
	if (wage < 0.0) 
		throw new IllegalArgumentException ("Wage must be non negative");

this.wage = wage;
}

public double getWage() {return wage;}

public double earnings() {return hours * wage;}

@Override
public String toString() {
	return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f", super.toString(), "hours worked", hours, 
			"pay per hour", wage, "earnings", earnings());	
}
}
