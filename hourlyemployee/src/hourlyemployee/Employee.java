package hourlyemployee;

public class Employee extends Object {

		private final String firstName;
		private final String lastName;
		private final String socialSecurityNumber;
		
		public Employee (String firstName, String lastName, String socialSecurityNumber) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
			
		}
		
		public String getFirstName() {return firstName;}
		public String getLastName() {return lastName;}
		public String getSocialSecurityNumber() {return socialSecurityNumber;}
		
		public String toString() {
			return String.format("%s: %s %s%n%s: %s%n", "employee", firstName, lastName,
					"social security number", socialSecurityNumber);
		}
		
		
	}

