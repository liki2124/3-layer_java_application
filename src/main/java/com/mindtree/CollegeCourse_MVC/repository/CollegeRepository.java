package com.mindtree.CollegeCourse_MVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.CollegeCourse_MVC.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {
public College findById(int id);
	
	@Query("select c from College c where c.location=?1")
	List<College> findByLocation(String location);
	
	@Query("select c from College c order by c.rating desc")
	List<College> findCollege();
	
}
