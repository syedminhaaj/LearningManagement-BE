package com.seliniumexpress.lms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Instructor")
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column(name = "instructor_id")
	private long id;

	private String name;

	@Column(name = "trainingexp")
	private int teachingExp;

	private String email;

	@OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER)
    @JsonManagedReference
	private List<Course> courses;

	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instructor(String name, int teachingExp, String email) {
		this.name = name;
		this.teachingExp = teachingExp;
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", teachingExp=" + teachingExp + ", email=" + email + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeachingExp() {
		return teachingExp;
	}

	public void setTeachingExp(int teachingExp) {
		this.teachingExp = teachingExp;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
