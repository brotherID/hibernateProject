package com.websystique.hibernate.model;

import java.util.HashSet;
import java.util.Set;


public class University {


	private Long id;
	private String name;
	private Set<Student> students = new HashSet<Student>();

	public University() {

	}

	public University(Long id, String name, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", students=" + students + "]";
	}

}
