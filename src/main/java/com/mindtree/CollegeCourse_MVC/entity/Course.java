package com.mindtree.CollegeCourse_MVC.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String name;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name +    "]";
	}
	
	

}

