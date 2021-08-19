package lk.ac.vau.Controller;

import lk.ac.vau.Controller.StudnetController;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lk.ac.vau.Model.Course;
import lk.ac.vau.Model.Student;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)




public class CourseController {
	
	Map<String, Course> courses=new HashMap<String, Course>();
	public CourseController() {
		Course it=new Course("ICT4132","Information Tecnology",2);
		Course maths=new Course("ICT4142","Maths",2);
		Course code=new Course("ICT4152","Programming",2);
	
		courses.put(it.getCourseid(),it);
		courses.put(maths.getCourseid(),maths);
		courses.put(code.getCourseid(),code);
	
	
	}
	
	@GetMapping
	public Collection<Course> getAll(){
		return courses.values();
		
	}
	
	@GetMapping("/{id}")	
	public Course get(@PathVariable("id") String id) {
		return courses.get(id);
		
	}
	
	
	
	
	
	
	
	
}
