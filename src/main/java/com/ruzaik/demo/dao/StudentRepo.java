package com.ruzaik.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruzaik.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, String>{

}
