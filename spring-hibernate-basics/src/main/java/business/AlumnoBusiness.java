package business;

import java.util.List;

import model.Alumno;
import persistence.AlumnoDao;

public interface AlumnoBusiness {
	
	void createAlumno(String nombre, String apellido, String tipoDocumento,
			String documento, int edad);
	
	void deleteAlumno(long id);
	
	void updateAlumno(long id, String nombre, String apellido, String tipoDocumento,
			String documento, int edad);
	
	Alumno getAlumno(long id);
	
	List<Alumno> getAllAlumnos();
	
	void setAlumnoDao(AlumnoDao alumnoDao);

}
