package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService; 
import Entities.Customer;
import MernisServiceReference.*;

public class MernisServerAdapter implements ICustomerCheckService {
	 
	
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
	}
	
}
