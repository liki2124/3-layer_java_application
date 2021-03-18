package com.mindtree.CollegeCourse_MVC.service;

import java.util.List;

import com.mindtree.CollegeCourse_MVC.entity.College;
import com.mindtree.CollegeCourse_MVC.exception.ServiceException.LocationNotFoundException;



public interface CollegeService {
	List<College> getCollegeSorted();

	void storeCollege(College college);

	List<College> getCollegeBasedOnLocation(String location) throws LocationNotFoundException;

	List<College> basedOnCourseAndLocation(String location, String course) throws LocationNotFoundException;
}
