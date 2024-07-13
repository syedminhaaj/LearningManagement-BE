package com.seliniumexpress.lms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.entity.Instructor;
import com.seliniumexpress.lms.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/") 
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/viewCourse")
	public ResponseEntity<Optional<Course>> showCoursePage(@RequestParam("courseId") int courseId) {
		 Optional<Course> findCourseById = courseService.findCourseById(courseId);
		 return ResponseEntity.ok(findCourseById);
	}

}
