package com.training.springboot.courseservie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.courseservie.model.Course;

public interface CourseRepository extends JpaRepository<Course,String>{
		
		}

