package dao;

import java.io.Serializable;

public interface GenericInterfaceDao<Entity,PK extends Serializable> {
	
	public boolean save(Entity e);
	public boolean delete(Entity e);
	public boolean update(Entity e); 
	public Entity search(PK id);

}
