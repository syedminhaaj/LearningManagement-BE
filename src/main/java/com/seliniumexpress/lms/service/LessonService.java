package com.seliniumexpress.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seliniumexpress.lms.entity.Course;
import com.seliniumexpress.lms.entity.Lesson;
import com.seliniumexpress.lms.repo.LessonRepository;

@Service
public class LessonService {

	@Autowired
	private LessonRepository lessonRepo;
	
	@Transactional
	public Optional<Lesson> findLessonById(int id) {
		
		 Optional<Lesson> lesson = lessonRepo.findById(id);
       
		 return lesson;
	
	}
}
