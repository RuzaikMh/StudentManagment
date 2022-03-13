package com.ruzaik.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String studentName;
	@Id
	private String registrationNumber;
	private String course;
	private String nic;
	private String phoneNumber;
	private String email;
	private String address;
	private String date;
	private String province;
	private String district;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", registrationNumber=" + registrationNumber + ", course="
				+ course + ", nic=" + nic + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", date=" + date + ", province=" + province + ", district=" + district + "]";
	}
}