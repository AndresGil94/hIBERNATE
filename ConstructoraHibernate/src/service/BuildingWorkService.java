package service;

import java.io.Serializable;

import dao.GenericDao;
import dao.GenericInterfaceDao;
import dao.OutsourceDao;

public class BuildingWorkService implements GenericInterfaceDao {
	
	private GenericInterfaceDao genericInterfaceDao;
	
	public BuildingWorkService() {
		
		genericInterfaceDao = new OutsourceDao();
	}
	@Override
	public boolean save(Object e) {
		genericInterfaceDao.save(e);
		return true;
	}

	@Override
	public boolean delete(Object e) {
		genericInterfaceDao.delete(e);	
		return true;
	}

	@Override
	public boolean update(Object e) {
		genericInterfaceDao.update(e);
		return true;
	}

	@Override
	public Object search(Serializable id) {
		genericInterfaceDao.search(id);
		return true;
	}
	

}
