package persistence;

import java.util.List;

import model.Alumno;

public interface AlumnoDao extends Dao<Alumno, Long> {
		
	List<Alumno> findByLastName(String lastName);

}
