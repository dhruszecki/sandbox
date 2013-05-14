package persistence.impl;

import java.util.Arrays;
import java.util.List;

import model.Alumno;
import persistence.AlumnoDao;

public class DummyAlumnoDao implements AlumnoDao {

	public void create(Alumno e) { 	
		System.out.println("creando alumno: " + e);
	}

	public void delete(Alumno e) {		
		System.out.println("borrando alumno: " + e);
	}

	public void update(Alumno e) {		
		System.out.println("actualizando alumno: " + e);
	}

	public Alumno findById(Long id) {
		Alumno a  = new Alumno("hector", "gomez", "dni", "78787878", 50);
		a.setId(100);
		return a;
	}

	public List<Alumno> findAll() {
		Alumno a  = new Alumno("hector", "gomez", "dni", "78787878", 50);
		Alumno b  = new Alumno("juan", "gomez", "dni", "65656565", 45);		
		return Arrays.asList(a,b);
	}

	public List<Alumno> findByLastName(String lastName) {
		Alumno a  = new Alumno("hector", "gomez", "dni", "78787878", 50);
		Alumno b  = new Alumno("juan", "gomez", "dni", "65656565", 45);		
		return Arrays.asList(a,b);
	}


}
