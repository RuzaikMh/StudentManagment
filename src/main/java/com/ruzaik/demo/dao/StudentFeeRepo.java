package com.ruzaik.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ruzaik.demo.model.StudentFee;

public interface StudentFeeRepo extends JpaRepository<StudentFee, Integer> {

	@Query("from StudentFee where studentName like %?1%")
	List<StudentFee> findByStudentNameLike(String studentName);
}
