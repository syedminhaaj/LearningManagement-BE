package com.seliniumexpress.lms.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seliniumexpress.lms.entity.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer>{
	
}
