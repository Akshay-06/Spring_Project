package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	
	// Both of the below two methods will work. If you want to do complex queries then it's better to go with second approach
	//Or else you can go with Query DSL
	
//	Student findBySname(String sname); //Query DSL
	
	@Query("from Student where sname= :name")
	Student findByName(@Param("name") String sname);
	

}
