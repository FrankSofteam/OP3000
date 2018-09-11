package dao;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helpers.HibernateHelper;
import model.Commande;

public class CommandeDAO {
	public static Stream<Commande> list() {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;
		Stream<Commande> result = null;
		try {
			t = s.beginTransaction();
			
			result = s.createQuery("FROM commandes").list().stream();
			
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return null;
	}
	public static Commande create(Commande cde) {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;

		try {
			t = s.beginTransaction();
			s.save(cde);
					
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return cde;

	}
	public static Commande update(Commande cde) {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;

		try {
			t = s.beginTransaction();
			s.save(cde);
					
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return cde;

	}

}
