package dao;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helpers.HibernateHelper;
import model.Client;

public class ClientDAO {
	public static Stream<Client> list() {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;
		Stream<Client> result = null;
		try {
			t = s.beginTransaction();
			
			result = s.createQuery("FROM Clients").list().stream();
			
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return null;
	}
	public static Client create(Client clt) {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;

		try {
			t = s.beginTransaction();
			s.save(clt);
					
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return clt;

	}
}
