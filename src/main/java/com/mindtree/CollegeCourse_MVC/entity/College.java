package com.mindtree.CollegeCourse_MVC.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class College {
	@Id
	private int id;
	private String name;
	private String category;
	private String location;
	private double rating;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Course> course;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, String category, String location, double rating, List<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.location = location;
		this.rating = rating;
		this.course = course;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", category=" + category + ", location=" + location
				+ ", rating=" + rating + ", course=" + course + "]";
	}



	
	

}
