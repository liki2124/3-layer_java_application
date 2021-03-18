package com.mindtree.CollegeCourse_MVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.CollegeCourse_MVC.entity.College;
import com.mindtree.CollegeCourse_MVC.entity.Course;
import com.mindtree.CollegeCourse_MVC.exception.ServiceException.LocationNotFoundException;
import com.mindtree.CollegeCourse_MVC.service.CollegeService;
import com.mindtree.CollegeCourse_MVC.service.CourseService;

@Controller
public class CollegeController {
	
	@Autowired
	private CollegeService collegeS;
	
	@Autowired
	private CourseService courseS;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/topcolleges")
	public ModelAndView topColleges(ModelAndView model) {
		List<College> college=collegeS.getCollegeSorted();
		model.addObject("college",college);
		model.setViewName("topcolleges");
		return model;
	}
	
	@RequestMapping("/location")
	public String locationBased() {
		return "location";
	}
	
	@RequestMapping("/basedonlocation")
	public ModelAndView collegeBasedOnLocation(@RequestParam("location") String location,ModelAndView model) {
		try {
		List<College> college=collegeS.getCollegeBasedOnLocation(location);
		model.addObject("college",college);
		model.setViewName("topcolleges");
		return model;
		}catch(LocationNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
			model.addObject("college","Location Not Found");
			model.setViewName("exception");
			return model;
		}
		
	}
	
	//
	@RequestMapping("/addcollege")
	public String addNewCollege(Model model) {
		return "addcollege";
	}
	
	@RequestMapping("/storecollege")
	public String storeCollege(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("category") String category,@RequestParam("course") List<String> course,@RequestParam("location") String location,@RequestParam("rating") double rating) {
		List<Course> c=courseS.getCourse(course);
		College college=new College(id,name,category,location,rating,c);
		collegeS.storeCollege(college);
		return "home";
		
	}
	//
	
	@RequestMapping("/courselocation")
	public String getBasedOnCourseLocation() {
		return "courselocation";
	}
	
	@RequestMapping("/basedoncourselocation")
	public ModelAndView BasedOnCourseLocation(@RequestParam("location") String location,@RequestParam("course") String course,ModelAndView model) {
		try{
		List<College> college=collegeS.basedOnCourseAndLocation(location,course);
		model.addObject("college",college);
		model.setViewName("topcolleges");
		return model;
		}catch(LocationNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
			model.addObject("college","Location/Course Not Found");
			model.setViewName("exception");
			return model;
		}
		
	}
	
	
	
	

}
