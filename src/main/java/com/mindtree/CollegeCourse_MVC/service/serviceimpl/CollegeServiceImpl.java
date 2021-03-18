package com.mindtree.CollegeCourse_MVC.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.CollegeCourse_MVC.entity.College;
import com.mindtree.CollegeCourse_MVC.entity.Course;
import com.mindtree.CollegeCourse_MVC.exception.ServiceException.LocationNotFoundException;
import com.mindtree.CollegeCourse_MVC.repository.CollegeRepository;
import com.mindtree.CollegeCourse_MVC.service.CollegeService;


@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	private CollegeRepository repo;
	
	@Override
	public List<College> getCollegeSorted() {
		List<College> college=repo.findCollege();
		return college;
	}

	@Override
	public void storeCollege(College college) {
		repo.save(college);
	}

	@Override
	public List<College> getCollegeBasedOnLocation(String location) throws LocationNotFoundException {
		List<College> res=repo.findByLocation(location);
		if(res.size()<=0) {
			throw new LocationNotFoundException("Location Not Found ");
		}
		return res;
	}

	@Override
	public List<College> basedOnCourseAndLocation(String location, String course) throws LocationNotFoundException {
		List<College> college=repo.findAll();
		List<College> res=new ArrayList<College>();
		for(College list:college) {
			if(list.getLocation().equalsIgnoreCase(location)) {
				System.out.println(list);
			for(Course c:list.getCourse()) {
				if(c.getName().equalsIgnoreCase(course)) {
					res.add(list);
				}
			}
			}
		}
		if(res.size()<=0) {
			throw new LocationNotFoundException("Location/Course Not Found ");
		}
		return res;
	}

}
