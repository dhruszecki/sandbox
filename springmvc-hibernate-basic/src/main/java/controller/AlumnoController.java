package controller;

import model.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import persistence.AlumnoDao;

@Transactional
@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listAlumnos(ModelMap model) {
        model.addAttribute("alumno", new Alumno());
        model.addAttribute("alumnos", alumnoDao.findAll());
        return "alumnos";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAlumno(@ModelAttribute("alumno") Alumno alumno, BindingResult result) {

    	alumnoDao.create(alumno);

        return "redirect:/";
    }

    @RequestMapping("/delete/{alumnoId}")
    public String deleteAlumno(@PathVariable("alumnoId") Long alumnoId) {

    	alumnoDao.delete(alumnoDao.findById(alumnoId));

        return "redirect:/";
    }

}
