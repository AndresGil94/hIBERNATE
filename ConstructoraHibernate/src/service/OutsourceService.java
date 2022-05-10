package service;

import java.io.Serializable;
import java.util.ArrayList;

import dao.GenericDao;
import dao.GenericInterfaceDao;
import dao.OutsourceDao;
import dao.OutsourceInterface;
import entity.OutsourceCompany;

public class OutsourceService implements OutsourceInterface {

	private OutsourceInterface outsourceInterface;
	
	
	public OutsourceService() {
		
		outsourceInterface = new OutsourceDao();
	}


	@Override
	public boolean save(OutsourceCompany e) {
		outsourceInterface.save(e);
		return true;
	}

;
	@Override
	public boolean delete(OutsourceCompany e) {
		outsourceInterface.delete(e);
		return true;
	}


	@Override
	public boolean update(OutsourceCompany e) {
		outsourceInterface.update(e);
		return true;
	}


	@Override
	public OutsourceCompany search(Long id) {
	
		return outsourceInterface.search(id);
		
	}


	@Override
	public ArrayList<OutsourceCompany> showAll() {
		return outsourceInterface.showAll();
		 
	}
}