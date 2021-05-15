package intro;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServerAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServerAdapter());
			try {
				customerManager.save(new Customer(1,"Fatmagül","Dursun",LocalDate.of(2001,03,18),"00000000000"));
			} catch (Exception e) {
				System.out.println("Validation unsuccessful. Customer don't saved to db.");
			}
			
		

}}
