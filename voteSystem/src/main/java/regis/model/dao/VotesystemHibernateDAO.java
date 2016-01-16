package regis.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import regis.model.Votesystem;
import all.util.HibernateUtil;



public class VotesystemHibernateDAO implements VotesystemDAO {

	public int save(Votesystem vs) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		int count = 0;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(vs);
			tx.commit();
			count = 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null)
				tx.rollback();

		}
		return count;
	}

	public Votesystem findByPrimaryKey(long key) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Votesystem vs = null;
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			vs = (Votesystem) session.get(Votesystem.class, key);
			//System.out.println("member是  " + member);
			tx.commit();
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		}
		// finally {
		// if (session != null)
		// session.close();
		// }
		// factory.close();
		return vs;
	}
	
	public int update(Votesystem vs) {
		int count = 0;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
//			session.setFlushMode(FlushMode.AUTO);
			session.merge(vs);
//			session.flush();
//			session.refresh(member);
//			session.clear();
			tx.commit();
			count = 1;
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		}
		// finally {
		// if (session != null)
		// session.close();
		// }
		// factory.close();

		return count;

	}

	public List<Votesystem> findPlan(Long word) {
		List<Votesystem> list = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "FROM Votesystem b WHERE b.no like :word";
			Query query = session.createQuery(hql);
//			query.setParameter("word", "%"+word+"%");
			query.setParameter("word", word);
			list = query.list();
			// for (Member e : list) {
			// System.out.printf("%2d %6s %6d %14s %2d\n", e.getId(),
			// e.getMemberName(), e.getmemberPs(), e.getmemberEmail());
			//
			// }
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			System.out.println(e.getMessage());
		}

		return list;
	}
	public List<Votesystem> getClass(String word) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		List<Votesystem> list = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("from Votesystem"); // HQL
			list = (List<Votesystem>) query.list();
			tx.commit();
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			System.out.println(ex.getMessage());
		}
		return list;
	}
	
	
	
	
	
	
	public List<Votesystem> getAll() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		List<Votesystem> list = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("from Votesystem"); // HQL
			list = (List<Votesystem>) query.list();
			tx.commit();
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			System.out.println(ex.getMessage());
		}
		return list;
	}


}
