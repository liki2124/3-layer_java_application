package com.mindtree.CollegeCourse_MVC.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.CollegeCourse_MVC.entity.College;
import com.mindtree.CollegeCourse_MVC.entity.Course;
import com.mindtree.CollegeCourse_MVC.repository.CourseRepository;
import com.mindtree.CollegeCourse_MVC.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository repo;

	@Override
	public List<Course> getCourse(List<String> course) {
		List<Course> c=repo.findAll();
		List<Course> cou=new ArrayList<Course>();
		for(Course list:c) {
			for(String l:course) {
			if(list.getName().equalsIgnoreCase(l)) {
				cou.add(list);
			}
			}
		}
		return cou;
	}

}
