package u1;

public class Bankaccount {
public static void main(String[] args) {
	RegularCustomer regcustomer1= new RegularCustomer("r123","krish","domestic",10000);
	RegularCustomer regcustomer2= new RegularCustomer("r124","krishna","business",10000);
	
	EnterpriseCustomer entcustomer1=new EnterpriseCustomer("r1233","madu","smallscale",10000);
	EnterpriseCustomer entcustomer2=new EnterpriseCustomer("r1234","madhu","bigscale",10000);
	regcustomer1.ShowCustomerDetails();
	System.out.println("final amount:"+regcustomer1.get_final_amount(5, 8));
	regcustomer2.ShowCustomerDetails();
	System.out.println("final amount:"+regcustomer2.get_final_amount(5, 8));
	
	entcustomer1.ShowCustomerDetails();
	System.out.println("final amount:"+entcustomer1.get_final_amount(5, 8));
	entcustomer2.ShowCustomerDetails();
	System.out.println("final amount:"+entcustomer2.get_final_amount(5, 8));
}
}
