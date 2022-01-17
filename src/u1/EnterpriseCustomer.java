package u1;

public class EnterpriseCustomer extends Customer{
	 String CustomerID;
	 String Customername;
	 String CustomerType;
	 double amount;
	EnterpriseCustomer(String custID, String custName, String custType, double amt) {
	 super(custID,custName,custType);
	 
	   this.CustomerID = custID;
		this.Customername = custName;
		this.CustomerType = custType;
		this.amount =amt;
	}
	double get_final_amount(double interest, int year) {
		double simple_interest=this.amount*interest*year;
		double amount =this.amount+simple_interest;
		amount = amount-500;
		if (this.CustomerType=="SmallScale"){
			return amount-100;
		}
		if (this.CustomerType=="BigScale"){
			return amount;
		}
		return amount;
	}
}	

