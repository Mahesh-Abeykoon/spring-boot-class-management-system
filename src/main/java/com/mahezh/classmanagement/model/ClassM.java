package com.mahezh.classmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class")

public class ClassM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="course_number")
	private int courseNumber;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="guardian_name")
	private String guardianName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contact_number")
	private long contactNumber;
	
	@Column(name="email_address")
	private String emailAddress;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public ClassM() {
		
	}
	
	public ClassM(String courseName, int courseNumber, String studentName, String guardianName, String address,
			long contactNumber, String emailAddress) {
		super();
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.studentName = studentName;
		this.guardianName = guardianName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	
	
	
	
	

	
}
