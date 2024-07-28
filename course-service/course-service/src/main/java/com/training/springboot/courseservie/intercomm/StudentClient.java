package com.training.springboot.courseservie.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springboot.courseservie.model.Student;



//@FeignClient(name="student",url="http://localhost:8082")
@FeignClient("springboot")
public interface StudentClient {
	@GetMapping("/stud")
 	public Student getstudent(@RequestParam long studId);

}
