package app;

import model.Alumno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import persistence.AlumnoDao;

import business.AlumnoBusiness;
import business.impl.AlumnoBusinessImpl;

public class StartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto-spring.xml");

		AlumnoBusiness alumnoBusiness = (AlumnoBusiness) context.getBean("alumnoBusiness");
		
		doWork(alumnoBusiness);
		
		AlumnoDao dummyDao = (AlumnoDao) context.getBean("dummyAlumnoDao");
		alumnoBusiness.setAlumnoDao(dummyDao);
		
		doWork(alumnoBusiness);
		
	}

	private static void doWork(AlumnoBusiness alumnoBusiness) {
		System.out.println("====== Do Work ======"); 
		alumnoBusiness.createAlumno("juan", "Perez", "dni", "2222222", 20);
		
		System.out.println("alumno id 1: " + alumnoBusiness.getAlumno(1));
		
		for (Alumno a : alumnoBusiness.getAllAlumnos()) {
			System.out.println(a);
		}
		System.out.println("======  ======  ======");
	}

}
