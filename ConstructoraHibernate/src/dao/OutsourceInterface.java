package dao;

import java.util.ArrayList;

import entity.OutsourceCompany;

public interface OutsourceInterface extends GenericInterfaceDao<OutsourceCompany,Long> {
	
	
	public ArrayList<OutsourceCompany> showAll();
	
}
