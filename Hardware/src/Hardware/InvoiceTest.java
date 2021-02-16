package Hardware;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
	
				Scanner input = new Scanner(System.in);
				Invoice myInvoice = new Invoice(null, null, 0, 0);
				
						
				System.out.print("Enter the part number: "); // prompt for part number
				String partNumber = input.nextLine();
				myInvoice.setPartNumber(partNumber);
				
				System.out.print("Enter the part description: "); // prompt for description
				String partDescription = input.nextLine(); // read description
				myInvoice.setPartDescription(partDescription);
				
				System.out.print("Enter the quantity of items: "); // prompt for quantity
				int quantityItem = input.nextInt(); // read quantity
				myInvoice.setQuantityItem(quantityItem);
				
				System.out.print("Enter the price of the item in decimals: "); // prompt for price
				double itemPrice = input.nextDouble();
				myInvoice.setItemPrice(itemPrice);
				
				System.out.println("Using all the get methods the state of the object is ");
				System.out.println("The part number is " + partNumber);
				System.out.println("The part description is " + partDescription);
				System.out.println("The quantity of items is " + quantityItem);
				System.out.printf("The price of the item is %.2f%n", + itemPrice);
				
				System.out.printf("Using getInvoiceAmout the invoice is %.2f%n", myInvoice.getInvoiceAmount());
				System.out.println();
				System.out.println();
				
				
				
				System.out.println("Using the setters to mutate the object one step at a time ");
				
				System.out.print("Enter the new price per item in decimals: ");
				itemPrice = input.nextDouble();
				myInvoice.setItemPrice(itemPrice);
				
				System.out.println("Using all the get methods the state of the object is ");
				System.out.println("The part number is " + myInvoice.getPartNumber());
				System.out.println("The part description is " + myInvoice.getPartDescription());
				System.out.println("The quantity of items is " + myInvoice.getQuantityItem());
				System.out.printf("The price of the item is %.2f%n", myInvoice.getItemPrice());
				
				System.out.printf("Using getInvoiceAmout the invoice is %.2f%n", myInvoice.getInvoiceAmount());
				System.out.println();
				
				System.out.print("Enter the quantity of Items: ");
				quantityItem = input.nextInt();
				myInvoice.setQuantityItem(quantityItem);
				
				System.out.println("Using all the get methods the state of the object is ");
				System.out.println("The part number is " + myInvoice.getPartNumber());
				System.out.println("The part description is " + myInvoice.getPartDescription());
				System.out.println("The quantity of items is " + myInvoice.getQuantityItem());
				System.out.printf("The price of the item is %.2f%n", myInvoice.getItemPrice());
				
				System.out.printf("Using getInvoiceAmout the invoice is %.2f%n", myInvoice.getInvoiceAmount());
				System.out.println();
				
				System.out.print("Enter the new part description: ");
				partDescription = input.next();
				myInvoice.setPartDescription(partDescription);
				
				System.out.println("Using all the get methods the state of the object is ");
				System.out.println("The part number is " + myInvoice.getPartNumber());
				System.out.println("The part description is " + myInvoice.getPartDescription());
				System.out.println("The quantity of items is " + myInvoice.getQuantityItem());
				System.out.printf("The price of the item is %.2f%n", myInvoice.getItemPrice());
				System.out.printf("Using getInvoiceAmout the invoice is %.2f%n", myInvoice.getInvoiceAmount());
				System.out.println();
				
				System.out.print("Enter the new part number: ");
				partNumber = input.next();
				myInvoice.setPartNumber(partNumber);
				
				System.out.println("Using all the get methods the state of the object is ");
				System.out.println("The part number is " + myInvoice.getPartNumber());
				System.out.println("The part description is " + myInvoice.getPartDescription());
				System.out.println("The quantity of items is " + myInvoice.getQuantityItem());
				System.out.printf("The price of the item is %.2f%n", myInvoice.getItemPrice());
				System.out.printf("Using getInvoiceAmout the invoice is %.2f%n", myInvoice.getInvoiceAmount());
				System.out.println();
				
				
				
			}
				
				
}


