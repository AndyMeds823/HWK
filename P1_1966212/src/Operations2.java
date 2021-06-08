import java.util.ArrayList;
import java.util.Comparator;
public  class Operations2 extends Operations {
	
	@Override
	public ArrayList<Account> heightAmountPaidUsers() {
		Account sub = getAccount().stream().max(Comparator.comparing(num-> num.getamountoPay())).get();
		System.out.println(sub.getCustomer().getuserName());
		return null;
		
	}
	
	
	public void concatUserNames(){
		String a1="",a2="";
		//ArrayList<Account> arr =getAccount();
		for(Account n : getAccount()) {
			if(n.getCustomer().gettype()=="3G") {
				
				a1=n.getCustomer().getuserName();
			} else if(n.getCustomer().gettype()=="4G") {
				
				a2=n.getCustomer().getuserName();
			}
		}
		System.out.println(a1+" : "+a2);
	}
}
