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
import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.entity.Instructor;
import com.seliniumexpress.lms.service.CourseService;
import com.seliniumexpress.lms.service.InstructorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/") 
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
    private InstructorService instructorService;
	
	@GetMapping("/viewCourse")
	public ResponseEntity<Optional<Course>> showCoursePage(@RequestParam("courseId") int courseId) {
		 Optional<Course> findCourseById = courseService.findCourseById(courseId);
		 return ResponseEntity.ok(findCourseById);
	}
	
//	 Written a DTO method to return only name and id and
//	skipping all other information about the courses and lesson
	@GetMapping("/instructor-list")
	public ResponseEntity<List<InstructorDTO>> getAllInstructor(){
		List<Instructor> allUsers = instructorService.getAllUsers();
		List<InstructorDTO> dtoList = InstructorMapper.toDTOList(allUsers);
		 return ResponseEntity.ok(dtoList);
		
	}
	
	@PostMapping("/saveCourse")
	public ResponseEntity<Course> saveCourse(@RequestBody CourseDTO courseDTO){
		Course course = new Course();
        course.setCourseName(courseDTO.getCourseName());
        course.setCourseDuration(courseDTO.getCourseDuration());
        Optional<Instructor> instructorOpt = instructorService.findById(courseDTO.getInstructorId());
        if (instructorOpt.isPresent()) {
            course.setInstructor(instructorOpt.get());
        }
		 System.out.println("course is "+course.toString());
		 Course saveCourse = courseService.saveCourse(course);
		 return ResponseEntity.ok(saveCourse);
		 
	}
	}

