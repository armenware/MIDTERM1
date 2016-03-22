package com.cisc181.core;
import java.util.UUID;
import java.util.Date;
public class Section {
private UUID CourseID;
private UUID SemesterID;
private UUID SectionID;
private int RoomID;

public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID) {
	super();
	this.CourseID = CourseID;
	this.SemesterID = SemesterID;
	this.SectionID = SectionID;
	this.RoomID = RoomID;
}

public UUID getCourseID() {
	return this.CourseID;
}

public void setCourseID(UUID courseID) {
	this.CourseID = CourseID;
}

public UUID getSemesterID() {
	return this.SemesterID;
}

public void setSemesterID(UUID semesterID) {
	this.SemesterID = SemesterID;
}

public UUID getSectionID() {
	return this.SectionID;
}

public void setSectionID(UUID sectionID) {
	this.SectionID = SectionID;
}

public int getRoomID() {
	return this.RoomID;
}

public void setRoomID(int roomID) {
	this.RoomID = RoomID;
}

}




