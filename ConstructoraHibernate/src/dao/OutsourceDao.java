package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.OutsourceCompany;
import util.HibernateUtil;

public class OutsourceDao extends GenericDao<OutsourceCompany,Long> implements OutsourceInterface {

	public ArrayList<OutsourceCompany> showAll(){
	
		
		ArrayList<OutsourceCompany> outsourceArray = new ArrayList<OutsourceCompany>();
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			transaction = session.beginTransaction();
			outsourceArray = (ArrayList<OutsourceCompany>) session.createQuery("from Outsource").list();
		}catch (RuntimeException r) {
			r.printStackTrace();
		}finally {
			session.flush();
			session.close();
		}
		return outsourceArray;
	}
	
}
