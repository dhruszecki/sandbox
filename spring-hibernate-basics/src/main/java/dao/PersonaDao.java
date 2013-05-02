package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Person;

@Repository
public class PersonaDao implements Dao<Person> {
	
	@Autowired
	private SessionFactory sf;

	public void create(Person e) {
		sf.getCurrentSession().save(e);		
	}

	public void udpate(Person e) {
		sf.getCurrentSession().update(e);		
	}

	public void delete(Person e) {
		sf.getCurrentSession().delete(e);		
	}

	public Person findById(long id) {
		return null;
	}

	public List<Person> findAll() {
		return null;
	}

}
