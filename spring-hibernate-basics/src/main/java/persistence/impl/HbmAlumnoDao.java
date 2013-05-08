package persistence.impl;

import java.util.List;

import model.Alumno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import persistence.AlumnoDao;

@Repository
public class HbmAlumnoDao extends AbstractHbmDao<Alumno, Long>implements AlumnoDao {

	@Autowired
	public HbmAlumnoDao(SessionFactory sf) {
		super(sf);
	}

	@Override
	protected String getEntityName() {
		return "model.Alumno";
	}

	@Override
	protected String getIdName() {
		return "id";
	}

	@SuppressWarnings("unchecked")
	public List<Alumno> findByLastName(String lastName) {
		Session s = sf.getCurrentSession();		
		return s.createQuery("from Alumno where apellido = " + lastName).list();
	}

	
}
