package dao;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helpers.HibernateHelper;
import model.Produit;

public class ProduitDAO {

	public static Stream<Produit> list() {
		Session s =HibernateHelper.getSessionFactory().openSession();
		Transaction t = null;
		Stream<Produit> result = null;
		try {
			t = s.beginTransaction();
			
			result = s.createQuery("FROM Produits").list().stream();
			
		t.commit();
		} catch(Exception e) {
			if(t != null)
				t.rollback();
		} finally {
			s.close();
		}
		return result;
	}

	public static Produit create(Produit pro) {
        Session s = HibernateHelper.getSessionFactory().openSession();
        Transaction t = null;

        try {
            t = s.beginTransaction();
            
            // CODE
            s.save(pro);
            
            t.commit();
        } catch(Exception e) {
            if(t != null)
                t.rollback();
        } finally {
            s.close();
        }
        
        return pro;
    }
}
