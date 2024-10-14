package com.websystique.hibernate.model;

public class Student {

	private Long id;
	private String name;
	private University university;

	public Student() {
	}

	public Student(Long id, String name, University university) {
		super();
		this.id = id;
		this.name = name;
		this.university = university;
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

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", university=" + university + "]";
	}

}
