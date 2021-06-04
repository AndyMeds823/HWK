
public class Account {
	double amountoPay;
	Customer Customer;
	
	public Account() {
	}
	
	public Account(double amountoPay, Customer Customer) {
		this.amountoPay=amountoPay;
		this.Customer = Customer;
	}
	public double getamountoPay() {
		return amountoPay;
	}
	public void setamountoPay(double amountoPay) {
		this.amountoPay=amountoPay;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer Customer) {
		this.Customer=Customer;
	}
}
