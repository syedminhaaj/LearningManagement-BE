package com.seliniumexpress.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seliniumexpress.lms.dto.CourseDTO;
import com.seliniumexpress.lms.dto.InstructorDTO;
import com.seliniumexpress.lms.dto.InstructorMapper;
import com.seliniumexpress.lms.dto.LessonDTO;
import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.entity.Instructor;
import com.seliniumexpress.lms.entity.Lesson;
import com.seliniumexpress.lms.service.CourseService;
import com.seliniumexpress.lms.service.LessonService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/") 
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@Autowired
	private CourseService courseService;

	private Lesson saveLesson;
	
	@GetMapping("/viewLesson")
	public ResponseEntity<Optional<Lesson>> showCoursePage(@RequestParam("lessonId") int lessonId) {
		 Optional<Lesson> findLessonById = lessonService.findLessonById(lessonId);
		 return ResponseEntity.ok(findLessonById);
	}
	
	
	@PostMapping("/saveLesson")
	public ResponseEntity<Lesson> saveCourse(@RequestBody LessonDTO lessonDTO){
		
		Lesson lesson = new Lesson();
		
	lesson.setLessonName(lessonDTO.getLessonName());
	lesson.setLessonText(lessonDTO.getLessonText());
	lesson.setLink(lessonDTO.getLessonLink());
        Optional<Course> courseIdIs = courseService.findCourseById(lessonDTO.getCourseId());
       if (courseIdIs.isPresent()) {
           lesson.setCourse(courseIdIs.get());
       }
		   Lesson saveLesson = lessonService.saveLesson(lesson);
		 return ResponseEntity.ok(saveLesson);
		 
	}

}
