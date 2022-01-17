package u1;

public abstract class Customer {
 String CustomerID;
 String Customername; 
 String CustomerType;
public Customer(String customerID, String customername, String customerType) {
	super();
	CustomerID = customerID;
	Customername = customername;
	CustomerType = customerType;
}
 void ShowCustomerDetails() {
	 System.out.println("Customer Id :"+this.CustomerID);
	 System.out.println("Customer Name:"+ this.Customername);
	 System.out.println("Customer Type:"+this.CustomerType);
 }
 abstract double get_final_amount(double interrest, int year);
}
