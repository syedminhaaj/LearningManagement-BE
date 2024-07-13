package com.seliniumexpress.lms.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seliniumexpress.lms.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>  {

}
