package one_to_many;

import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import one_to_many.Cart;
import one_to_many.Item;

import javax.persistence.Entity;

/**
 * Hello world!
 *
 */
public class App 
{
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	private static SessionFactory buildSessionFactory() {

		BasicConfigurator.configure();
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;
	}

	public static void main(String[] args) {
		
		System.out.println("Start\n");

		sessionObj = buildSessionFactory().openSession();
		sessionObj.beginTransaction();

		for (int i = 0; i <= 4; i++) {
			Cart cartObj = new Cart();
			cartObj.setName("Name"+i);
			cartObj.setTotal(i);

			Set<Item> items = cartObj.getItems();

			for (int j = 0; j < 4; j++) {
				Item item = new Item();
				item.setItemId(j);
				item.setItemTotal(j);
				item.setQuantity(j);
				items.add(item);
			}
			System.out.println("You are here \n");
			cartObj.setItems(items);
			sessionObj.persist(cartObj);
		}

		System.out.println("\nEnd");
		sessionObj.getTransaction().commit();
		sessionObj.close();
	}
}
