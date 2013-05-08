package business.impl;

import java.util.List;

import model.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import persistence.AlumnoDao;
import business.AlumnoBusiness;

@Component(value="alumnoBusiness")
public class AlumnoBusinessImpl implements AlumnoBusiness {
	
	@Autowired
	private AlumnoDao alumnoDao;

	@Transactional
	public void createAlumno(String nombre
			,String apellido
			,String tipoDocumento
			,String documento
			,int edad) {		
		// validaciones de negocio
		Alumno alumno = new Alumno(nombre, apellido, documento, tipoDocumento, edad);
		alumnoDao.create(alumno);
	}

	@Transactional
	public void deleteAlumno(long id) {
		// validaciones
		Alumno alumno = new Alumno();
		alumno.setId(id);
		alumnoDao.delete(alumno);
		
	}

	@Transactional
	public void updateAlumno(long id
			,String nombre
			,String apellido
			,String tipoDocumento
			,String documento
			,int edad) {
		// validaciones de negocio
		Alumno alumno = new Alumno(nombre, apellido, documento, tipoDocumento, edad);
		alumno.setId(id);
		alumnoDao.update(alumno);		
	}

	@Transactional
	public Alumno getAlumno(long id) {
		return alumnoDao.findById(id);
	}

	@Transactional
	public List<Alumno> getAllAlumnos() {
		return alumnoDao.findAll();
	}

	public void setAlumnoDao(AlumnoDao alumnoDao) {
		this.alumnoDao = alumnoDao;
	}
	
	
}
