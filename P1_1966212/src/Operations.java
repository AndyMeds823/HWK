import java.util.ArrayList;

public abstract class Operations {

	private ArrayList<Customer> CustomerList;
	private ArrayList<Account> AccountList;

	public ArrayList<Customer> getCustomer() {
		return CustomerList;
	}
	public void setCustomer(ArrayList<Customer> CustomerList) {
		this.CustomerList= CustomerList;
	}
	
	public ArrayList<Account> getAccount(){
		return AccountList;
	}
	
	public void setAccount(ArrayList<Account> AccountList) {
		this.AccountList=AccountList;
	}
	
	public boolean addCustomer(Customer New) {
		if(!CustomerList.contains(New)) {
			CustomerList.add(New);
			System.out.println("Added: " + New);
			return true;
		}else
			System.out.println(New +" Already exists.");
		return false;	
	}
	public ArrayList<Account> calculateBillandAddAccount(int numD) {
		for(Customer check : CustomerList) {
			if(check.gettype().equals("3G") && check.getplanType()==1) {
				Account newAccount = new Account(numD*50, check);
				AccountList.add(newAccount);
			}else if(check.gettype().equals("3G")&& check.getplanType()==2) {
				Account newAccount = new Account(numD*75, check);
				AccountList.add(newAccount);
			}else if(check.gettype().equals("4G") && check.getplanType()==1) {
				Account newAccount = new Account(numD*70, check);
				AccountList.add(newAccount);
			}else if(check.gettype().equals("4G") && check.getplanType()==2) {
				Account newAccount = new Account(numD*100, check);
				AccountList.add(newAccount);
			}
		}
		return AccountList;
	}
	public abstract ArrayList<Account> heightAmountPaidUsers();
}
