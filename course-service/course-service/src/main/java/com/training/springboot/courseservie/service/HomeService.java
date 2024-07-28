package com.training.springboot.courseservie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.training.springboot.courseservie.model.Course;
import com.training.springboot.courseservie.repository.CourseRepository;

@Service
public class HomeService {
	@Autowired
CourseRepository repository;
	public Course addCourse(@RequestBody Course cou)
	{
		repository.save(cou);
		return cou;
	}
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	public Course getStudentbyid(String id)
	{
		Optional<Course>obj = repository.findById(id);
		return obj.orElse(null);
	}
	public void deleteStudentbyid(String id) {
		// TODO Auto-generated method stub
//		repository.deleteById(id);
		  try {
	            repository.deleteById(id);
	            
	        } catch (EmptyResultDataAccessException e) {
	            // This exception is thrown when trying to delete an entity that doesn't exist.
	            System.err.println("Student with ID " + id + " does not exist.");
	            
	        }
	}
	public Course update(String id,Course stu)
	{
		Course obj = repository.findById(id).orElseThrow();
		obj.setCourseName(stu.getCourseName());
		obj.setDuration(stu.getDuration());
		obj.setStrength(stu.getStrength()); 
//		obj.setStuId(id);
		return repository.save(obj);
//		return(repository.save(stu));
	}
	
}

