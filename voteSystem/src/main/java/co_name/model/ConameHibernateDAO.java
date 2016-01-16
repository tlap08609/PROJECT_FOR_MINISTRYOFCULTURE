package co_name.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import regis.model.Votesystem;
import all.util.HibernateUtil;



public class ConameHibernateDAO implements ConameDAO {

	public int save(Coname cn) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		int count = 0;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(cn);
			tx.commit();
			count = 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();

		}
		return count;
	}

	

}
