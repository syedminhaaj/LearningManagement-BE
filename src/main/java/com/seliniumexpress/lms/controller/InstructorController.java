package com.seliniumexpress.lms.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seliniumexpress.lms.entity.Instructor;
import com.seliniumexpress.lms.service.InstructorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/") 
public class InstructorController {
	@Autowired
    private InstructorService instructorService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Instructor>> getAllInstructor() {
    	
        List<Instructor> allUsers = instructorService.getAllUsers();
        if(allUsers.isEmpty()) {
        	return new ResponseEntity<>(Collections.emptyList(),HttpStatus.NOT_FOUND);
        }
        List<Instructor> allEmployeeDTOs= convertEntitiestoDtos(allUsers);
        return ResponseEntity.ok(allEmployeeDTOs);
    }
    
    @PostMapping("/saveInstructor")
    public ResponseEntity<Instructor> saveInstructor(@RequestBody Instructor instructor){
    	System.out.println("insut from controller"+instructor);

    	Instructor saveInstructor = instructorService.saveInstructor(instructor);
    	
    	return ResponseEntity.ok(saveInstructor);
    }
    
    private List<Instructor> convertEntitiestoDtos(List<Instructor> allUsers) {
		
    	return allUsers.stream()
    			.map(entity->{
    				Instructor ins=new Instructor();
    				BeanUtils.copyProperties(entity,ins);
    				return ins;
    			})
    			.collect(Collectors.toList());
	}
    
    @DeleteMapping("/{id}")
	public boolean deleteInstructor(@PathVariable long id) {
		
		System.out.println("****deleting the instructor with id :**** " + id);
		//deleting -> by making a service call
		return instructorService.deleteInstructor(id);
		
		
	}

}
