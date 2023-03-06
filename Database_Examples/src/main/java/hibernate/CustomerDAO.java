package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Data Access Object
public class CustomerDAO {

	public void insert(customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		session.close();

	}
	
	public void update(customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	public void delete(customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}
	

	public List<customer> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// This is HQL which is Hibernate Query Language
		// Also referred to as JPA

		String hql = "FROM Customer c where c.contactFirstname = :firstname";

		TypedQuery<customer> query = session.createQuery(hql, customer.class);
		query.setParameter("firstname", name);

		// When we know we are getting 0 or more records we use getResultList
		List<customer> result = query.getResultList();

		session.close();

		return result;
	}

	public customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// This is HQL which is Hibernate Query Language
		// Also referred to as JPA

		String hql = "FROM Customer c where c.id = :idParam";

		TypedQuery<customer> query = session.createQuery(hql, customer.class);
		query.setParameter("idParam", id);

		// When we know we are getting as single record we use getSingleResult
		customer result = query.getSingleResult();

		session.close();

		return result;
	}
	
	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// This is HQL which is Hibernate Query Language
		// Also referred to as JPA

		String hql = "delete FROM Customer c where c.id = :idParam";

		TypedQuery<customer> query = session.createQuery(hql, customer.class);
		query.setParameter("idParam", id);


		query.executeUpdate();

		session.close();

	}

}
