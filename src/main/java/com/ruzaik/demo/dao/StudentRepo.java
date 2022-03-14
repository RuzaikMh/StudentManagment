package com.ruzaik.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ruzaik.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, String>{

	@Query("from Student where studentName like %?1%")
	List<Student> findByStudentNameLike(String studentName);
}
