package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PersonaDao;
import entity.Person;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaDao personaDao;
	
	@Transactional
	public void crearPersona(String nombre, String apellido) {
		personaDao.create(new Person(nombre, apellido));
	}
	

}
