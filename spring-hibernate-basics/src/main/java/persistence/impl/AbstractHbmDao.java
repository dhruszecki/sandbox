package persistence.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import persistence.Dao;

public abstract class AbstractHbmDao<T, K> implements Dao<T, K> {
	
	protected SessionFactory sf;

	public AbstractHbmDao(SessionFactory sf) {
		this.sf = sf;
	}

	public void create(T e) {
		Session s = sf.getCurrentSession();
		s.save(e);
	}

	public void delete(T e) {
		Session s = sf.getCurrentSession();
		s.delete(e);
	}

	public void update(T e) {
		Session s = sf.getCurrentSession();
		s.update(e);
	}

	@SuppressWarnings("unchecked")
	public T findById(K id) {
		Session s = sf.getCurrentSession();
		Query q = s.createQuery("from "+getEntityName() + " where " +
		getIdName() + " = " + id);
		return (T) q.uniqueResult();	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Session s = sf.getCurrentSession();
		Query q = s.createQuery("from "+getEntityName());
		return q.list();	
	}
	
	protected abstract String getEntityName();
	protected abstract String getIdName();

}
