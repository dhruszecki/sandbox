package persistence.impl;

import model.Carrera;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import persistence.CarreraDao;

@Repository
public class HbmCarreraDao extends AbstractHbmDao<Carrera, Long> implements CarreraDao {

	@Autowired
	public HbmCarreraDao(SessionFactory sf) {
		super(sf);
	}

	@Override
	protected String getEntityName() {
		return "model.Carrera";
	}

	@Override
	protected String getIdName() {
		return "id";
	}
	
	

}
