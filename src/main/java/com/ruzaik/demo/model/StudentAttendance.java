package com.ruzaik.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentAttendance {

	@Id
	@GeneratedValue
	private int id;
	private String registrationNumber;
	private String date;
	private String attendance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		return "StudentAttendance [id=" + id + ", registrationNumber=" + registrationNumber + ", date=" + date
				+ ", attendance=" + attendance + "]";
	}
}
