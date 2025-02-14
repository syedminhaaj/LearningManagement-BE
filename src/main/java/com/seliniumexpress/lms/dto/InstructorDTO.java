package com.seliniumexpress.lms.dto;

public class InstructorDTO {
	private long id;

	public InstructorDTO(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public InstructorDTO() {
	}
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
