package com.cisc181.core;
import java.util.UUID;
public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
		this.EnrollmentID = EnrollmentID;
	}

	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	public UUID getStudentID(){
		return StudentID;
	}
	public void setStudentID(UUID StudentID){
		this.StudentID = StudentID;
	}
	public UUID getSectionID(){
		return SectionID;
	}
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	public double getGrade(){
		return Grade;
	}
	public void setGrade(double Grade){
		 this.Grade = Grade;
	}
	
	
}
