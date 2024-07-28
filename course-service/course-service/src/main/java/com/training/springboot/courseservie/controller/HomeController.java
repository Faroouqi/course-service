package com.training.springboot.courseservie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.courseservie.intercomm.StudentClient;
import com.training.springboot.courseservie.model.Course;
import com.training.springboot.courseservie.model.Student;
import com.training.springboot.courseservie.service.HomeService;



@RestController
public class HomeController {
	@Autowired
	HomeService service;
	
	@Autowired
	StudentClient studentclient;
	
	@GetMapping("/stud")	
	public Student getStudent(@RequestParam long studId)
	{
		return studentclient.getstudent(studId);	
	}
	
	@GetMapping("/course")
	public String greet() {
		return "we are at home page";
	}
	@PostMapping("/course1")
	public ResponseEntity<Course> addCourse(@RequestBody Course cou)
	{
		return new ResponseEntity<>(service.addCourse(cou),HttpStatus.CREATED);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Course> >getAll()
	{
		return new ResponseEntity<>(service.getAllCourse(),HttpStatus.OK);
//		return ;
	}
	@GetMapping("/list/{id}")
	public ResponseEntity<Course>findbyId(@PathVariable("id") String id)
	{
		return new ResponseEntity<>(service.getStudentbyid(id),HttpStatus.OK);


	}
	@DeleteMapping("/list/{id}")
//	ResponseEntity<String>
	public void deleteById(@PathVariable("id") String id) {

        		service.deleteStudentbyid(id);
//       
    }
	
	@PutMapping("/list/{id}")
	public ResponseEntity<Course> update(@PathVariable("id") String id,@RequestBody Course cou)
	{
		Course updated = service.update(id, cou);
		
		return new ResponseEntity<>(updated, HttpStatus.OK);
	}
	
	
	
}
