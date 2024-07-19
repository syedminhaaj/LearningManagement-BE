package com.seliniumexpress.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seliniumexpress.lms.entity.Instructor;
import com.seliniumexpress.lms.repo.InstructorRepository;

@Service
public class InstructorService {
	
	@Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllUsers() {
        return instructorRepository.findAll();
    }
    
    
    public Optional<Instructor> findById(long id) {
    	return instructorRepository.findById(id);
    }
    public Instructor saveInstructor(Instructor instructor) {
    	System.out.println("what is instructor"+instructor);
        return instructorRepository.save(instructor);
    }

	public boolean deleteInstructor(long id) {
		Optional<Instructor> instructor = instructorRepository.findById(id);

        if (instructor.isPresent()) {
            instructorRepository.deleteById(id);
            return true;
        }

        return false;
	}

}
