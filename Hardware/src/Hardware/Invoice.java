package Hardware;

import java.util.Scanner;

public class Invoice {
	
	private String partNumber;
	private String partDescription;
	private int quantityItem;
	private double itemPrice;
	
	
		
	public Invoice (String partNumber, String partDescription, int quantityItem, double itemPrice) {
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantityItem = quantityItem;
		this.itemPrice = itemPrice;
		
	}
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		public void setPartDescription(String partDescription) {
			this.partDescription = partDescription;
		}
		
		public void setQuantityItem(int quantityItem) {
			if (quantityItem > 0) {
			
				this.quantityItem = quantityItem;
			}
			else {
				this.quantityItem = 0;
			}
		}
		
		public void setItemPrice(double itemPrice) {
		
			if (itemPrice > 0.00) {
			
				this.itemPrice = itemPrice;
			}
			else {
				this.itemPrice = 0.00;
			}
		}
		
		public String getPartNumber() {
			return partNumber;
		}
		
		public String getPartDescription() {
			return partDescription;
		}
		
		public int getQuantityItem() {
			return quantityItem;
		}
		
		public double getItemPrice() {
			return itemPrice;
		}
		
		public double getInvoiceAmount() {
			double invoiceAmount = itemPrice * quantityItem;
			if (invoiceAmount > 0) {
				return invoiceAmount;
			}
			else {
				return 0.00;
			}	
			}
			
	}
