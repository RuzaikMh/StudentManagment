package com.ruzaik.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruzaik.demo.model.StudentFee;

public interface StudentFeeRepo extends JpaRepository<StudentFee, Integer> {

}
