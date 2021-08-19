package lk.ac.vau.Controller;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lk.ac.vau.Model.Student;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class StudnetController {
	
	Map<String, Student> students=new HashMap<String, Student>();
	public StudnetController() {
		Student kani=new Student("2016/ICT/06","Kanista",24,"IT",3.5);
		Student gopi=new Student("2016/ICT/01","Gopinath",25,"IT",3.8);
		Student shiyam=new Student("2016/ICT/31","Shiyam Suntar",26,"IT",3.0);
	
		students.put(kani.getId(),kani);
		students.put(gopi.getId(),gopi);
		students.put(shiyam.getId(),shiyam);
	
	
	}
	
	@GetMapping
	public Collection<Student> getAll(){
		return students.values();
		
	}
		
	@GetMapping("/{id}")	
	public Student get(@PathVariable("id") String id) {
		return students.get(id);
		
	}
		
	@PostMapping	
	public void add(@RequestBody Student student) {
		students.put(student.getId(),student);
		
	}
		
	@DeleteMapping("/{id}")	
	public void delete(@PathVariable("id") String id) {
		students.remove(id);
		
	}
		
	@PutMapping("/{id}")	
	public void update(@PathVariable("id") String id,@RequestBody Student student) {
		students.put(id,student);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
