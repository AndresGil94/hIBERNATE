package dao;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.BuildingWork;
import util.HibernateUtil;

public class BuildingWorkDao extends GenericDao<BuildingWork,Long> implements BuildingWorkInterface {

	@Override
	public ArrayList<BuildingWork> deadLineSearch(Date deadLine) {
		
		ArrayList<BuildingWork> buildingArray = new ArrayList<BuildingWork>();
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		try{
			transaction = session.beginTransaction();
			buildingArray = (ArrayList<BuildingWork>) session.createQuery("from BuildingWork where MONTH(deadLine) = " + deadLine.getMonth()).list();
			
		}catch(RuntimeException r) {
			r.printStackTrace();
		}finally {
			session.flush();
			session.close();
		}
		return buildingArray;
	}

	

	
}
