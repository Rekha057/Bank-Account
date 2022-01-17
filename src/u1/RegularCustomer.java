package u1;

public class RegularCustomer extends Customer{
	 String CustomerID;
	 String Customername;
	 String CustomerType;
	 double amount;
	 
	RegularCustomer(String custID, String custName, String custType, double amt) {
	 super(custID,custName,custType);
	   this.CustomerID = custID;
		this.Customername = custName;
		this.CustomerType = custType;
		this.amount =amt;
	 }
	    double get_final_amount(double interest, int year) {
		double simple_interest=this.amount*interest*year;
		double amount =this.amount+simple_interest;
		
		if (this.CustomerType=="Domestic"){
			return amount-100;
		}
		if (this.CustomerType=="Business"){
			return amount;
		}
		return amount;
	}
}
