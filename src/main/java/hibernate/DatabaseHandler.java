package hibernate;

import objects.ExampleObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.Serializable;

public class DatabaseHandler
{
	private Configuration   configuration;
	private ServiceRegistry serviceRegistry;
	private SessionFactory  sessionFactory;

	protected Session session;

	public DatabaseHandler()
	{
		configuration = new Configuration().configure();
		serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);

		session = sessionFactory.openSession();
	}

	public void save(ExampleObject object)
	{
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
	}

	public Object get(Serializable id)
	{
		return session.get(ExampleObject.class, id);
	}

	public void close()
	{
		session.close();

		StandardServiceRegistryBuilder.destroy(serviceRegistry);
	}
}
