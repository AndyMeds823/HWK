import java.util.ArrayList;
import java.util.List;

public class TestPro {
	public static void main(String[] arg) {
		ArrayList<Customer>CustomerList = new ArrayList<>();
			CustomerList.add(new Customer("LunaL",2021,"4G",2));
			CustomerList.add(new Customer("BalamT",2023,"3G",1));

			ArrayList<Account> Ac= new ArrayList<Account>();
			Ac.add(new Account(75,new Customer("GalanT",2008,"4G",1)));
			
			Operations2 opera = new Operations2();
			opera.setCustomer(CustomerList);
			opera.setAccount(Ac);
	}
}