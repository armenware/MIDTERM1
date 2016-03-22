package com.cisc181.core;
import java.util.UUID;
public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private String Major;
	
	public Course(UUID CourseID, String CourseName, int GradePoints, String Major) {
		super();
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	public UUID getCourseID() {
		return this.CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = CourseID;
	}
	public String getCourseName() {
		return this.CourseName;
	}
	public void setCourseName(String courseName) {
		this.CourseName = CourseName;
	}
	public int getGradePoints() {
		return this.GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = GradePoints;
	}
	public String getMajor() {
		return this.Major;
	}
	public void setMajor(String major) {
		this.Major = Major;
	}
	
	
}
