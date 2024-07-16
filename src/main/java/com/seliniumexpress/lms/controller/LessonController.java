package com.seliniumexpress.lms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.entity.Lesson;
import com.seliniumexpress.lms.service.CourseService;
import com.seliniumexpress.lms.service.LessonService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/") 
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@GetMapping("/viewLesson")
	public ResponseEntity<Optional<Lesson>> showCoursePage(@RequestParam("lessonId") int lessonId) {
		 Optional<Lesson> findLessonById = lessonService.findLessonById(lessonId);
		 return ResponseEntity.ok(findLessonById);
	}

}
