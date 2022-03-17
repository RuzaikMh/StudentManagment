package com.ruzaik.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ruzaik.demo.model.StudentAttendance;

public interface AttendanceRepo extends JpaRepository<StudentAttendance, Integer>{

	@Query("from StudentAttendance where registrationNumber like %?1%")
	List<StudentAttendance> findByRegistrationLike(String registrationNumber);
}
