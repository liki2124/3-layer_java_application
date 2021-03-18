package com.mindtree.CollegeCourse_MVC.service;

import java.util.List;

import com.mindtree.CollegeCourse_MVC.entity.Course;

public interface CourseService {

	List<Course> getCourse(List<String> course);

}
