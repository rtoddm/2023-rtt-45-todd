package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();

		// NOTE - we are not going to set the id column because hibernate / MYSQL will
		// automatically generate it for you
		customer customer = new customer();
		customer.setCustomerName("Hibernate customer");
		customer.setContactFirstname("First Name");
		customer.setContactLastname("Last Name");
		customer.setPhone("555-555-1212");
		customer.setAddressLine1("Address Line 1");
		customer.setCity("Atlanta");
		customer.setState("CO");
		customer.setCountry("USA");
		customerDao.insert(customer);

		customer first = customerDao.findById(497);
		System.out.println(first.toString());

		first.setAddressLine2("This is an update");
		first.setPostalCode("80203");
		first.setCreditLimit(100000.35);

		customerDao.update(first);
		customerDao.delete(first);

//		List<customer> firstNames = customerDao.findByContactFirstName("Leslie");
//		for(customer c : firstNames) {
//			System.out.println(c);
//		}
	}

}
