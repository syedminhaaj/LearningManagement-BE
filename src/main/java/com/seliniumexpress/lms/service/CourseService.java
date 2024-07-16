package com.seliniumexpress.lms.service;

import java.util.Optional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.repo.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Transactional
	public Optional<Course> findCourseById(int id) {
		
		 Optional<Course> course = courseRepo.findById(id);
		 
		 //Below alternatives if @JsonManagedReference is not working in entities
		 //Course course = couse.get();
         //Hibernate.initialize(course.getLessons());
       
		 return course;
	
	}

}
