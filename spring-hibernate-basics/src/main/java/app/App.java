package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.PersonaService;

public class App {
	
	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		PersonaService service = (PersonaService)context.getBean("personaService");
		service.crearPersona("Juan", "Perez");
	}

}
