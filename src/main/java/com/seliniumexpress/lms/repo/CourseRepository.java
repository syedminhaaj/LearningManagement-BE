package com.seliniumexpress.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seliniumexpress.lms.entity.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer>{

}
