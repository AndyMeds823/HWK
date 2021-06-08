import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public  class Operations2 extends Operations {

	@Override
	public ArrayList<Account> heightAmountPaidUsers() {
		Account sub = getAccount().stream().max(Comparator.comparing(num-> num.getamountoPay())).get();
		System.out.println(sub.getCustomer().getuserName());
		return null;
		
	}
	
}
