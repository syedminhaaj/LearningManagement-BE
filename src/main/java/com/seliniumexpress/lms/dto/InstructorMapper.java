package com.seliniumexpress.lms.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.seliniumexpress.lms.entity.Instructor;

public class InstructorMapper {
	 public static InstructorDTO toDTO(Instructor instructor) {
		 InstructorDTO dto = new InstructorDTO();
	        dto.setId(instructor.getId());
	        dto.setName(instructor.getName());
	        return dto;
	    }
	 
	  public static List<InstructorDTO> toDTOList(List<Instructor> instructors) {
	        return instructors.stream()
	                .map(InstructorMapper::toDTO)
	                .collect(Collectors.toList());
	    }
}
