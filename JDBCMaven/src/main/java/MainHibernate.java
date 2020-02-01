import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainHibernate {

	private static SessionFactory factory=null;
	
	public static void main(String[] args) {
		System.out.println("Hello hibernate");
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			factory = cfg.buildSessionFactory();
		} catch(Throwable ex) {
			
			System.err.println("Failed to create sessionFactory object." + ex);
		}
	}

}
