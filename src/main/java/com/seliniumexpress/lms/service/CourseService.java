package com.seliniumexpress.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.repo.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public Optional<Course> findCourseById(int id) {
		return courseRepo.findById(id);
	}

}
