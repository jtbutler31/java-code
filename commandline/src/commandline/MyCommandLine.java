package commandline;

public class MyCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total = 0.0;
		
		for (String str: args) {
			
			double d = Double.parseDouble(str);
			total += d;
		}
		
		System.out.println("The sum of the double values passed in from the command line is " + total);
	}

}
