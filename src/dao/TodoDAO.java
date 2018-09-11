package dao;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helpers.HibernateHelper;
import model.Todo;
import model.Client;

public class TodoDAO {

	public static Stream<Todo> list() {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;
		Stream<Todo> result = null;
		try {
			t = s.beginTransaction();
			
			result = s.createQuery("FROM Taches").list().stream();
			
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return result;
	}

	public static Todo create(Todo t) {
        Session s = HibernateHelper.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = s.beginTransaction();
            
            // CODE
            s.save(t);
            
            tx.commit();
        } catch(Exception e) {
            if(t != null)
                tx.rollback();
        } finally {
            s.close();
        }
        
        return t;
    }
	
}
