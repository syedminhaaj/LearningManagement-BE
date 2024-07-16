package com.seliniumexpress.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seliniumexpress.lms.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
