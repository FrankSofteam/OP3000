import org.hibernate.Session;

import dao.UserDAO;
import helpers.HibernateHelper;
import model.Todo;
import model.Client;

public class Main {
public static void main(String[] args) {
	
	Client u = new Client();
	u.setEmail("to@to.com");
	u.setPassword("123");
	
	Todo t = new Todo();
	t.setDescription("Ranger tout");
	
/*	u.addTaches(t);
	UserDAO.create(u):
		UserDAO.list().forEach(System.out::println);
		*/
}
}
