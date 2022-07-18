package com.example.Application.Controller;

import com.example.Application.Entity.Student;
import com.example.Application.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	// /student/1

	@GetMapping(value="/{id}")
	public Student getStudent(@PathVariable("id") Integer id){
		return studentService.getStudent(id);
	}

//	@GetMapping(value = "/first/{firstName}")
//	public int firstName(@PathVariable("firstName") String firstName){
//		return studentService.getCountByFirstName(firstName);
//	}

	@PostMapping(value = "/")
	public Student saveStudent(@RequestBody Student student){
		return studentService.saveStudent(student);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteStudent(@PathVariable("id") int id){
		studentService.deleteStudent(id);
	}
}

/*
MAIN

--controller
--Service
--Repository

DATABASE
*/