package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

import entity.BuildingWork;

public interface BuildingWorkInterface extends GenericInterfaceDao<BuildingWork,Long>{
	
	public ArrayList<BuildingWork> deadLineSearch (Date deadLine);

	
	

}
