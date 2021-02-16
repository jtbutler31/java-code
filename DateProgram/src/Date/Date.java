package Date;

public class Date {
	private int month;
	private int day;
	private int year;
	




	public void displayDate() {
		System.out.print("The date object's state is: ");
		System.out.print(+ month);
		System.out.print( "/");
		System.out.print(+ day);
		System.out.print("/");
		System.out.println(+ year);
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int setYear() {
		return year;
	}
}
