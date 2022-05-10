package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;

public class GenericDao<Entity,K extends Serializable> implements GenericInterfaceDao<Entity,K> {

	private Class<Entity> domainClass = getDomainClass();
	private Session session;
	
	protected Class getDomainClass () {
		if(domainClass == null) {
		ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
		domainClass = (Class) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
		}	
	
	private Session getHibernateConnection() {
		session = util.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		return session;
	}
	
	
	public boolean save(Entity e) {
		
		try {
			getHibernateConnection().save(e);
			session.getTransaction().commit();
		}catch(Exception ex) {
			System.err.println("Error al guardar");
		}
		
		return false;
	}

	
	public boolean delete(Entity e) {

		try {
			getHibernateConnection().delete(e);
			session.getTransaction().commit();
		}catch(Exception ex) {
			System.err.println("Error al eliminar");

		}
		
		return false;
	}

	
	public boolean update(Entity e) {

		try {
			getHibernateConnection().saveOrUpdate(e);
			session.getTransaction().commit();
		}catch(Exception ex){
			System.err.println("Error al actualizar");

		}
		
		return false;
	}

	
	public Entity search(K id) {
		
		Entity search = (Entity) getHibernateConnection().load(domainClass, id);
		session.getTransaction().commit();
		return search;
	}

}
