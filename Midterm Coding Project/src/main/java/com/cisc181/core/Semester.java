package com.cisc181.core;
import java.util.Date;
import java.util.UUID;
public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		super();
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
}

	public UUID getSemesterID() {
		return this.SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		this.SemesterID = SemesterID;
	}

	public Date getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(Date startDate) {
		this.StartDate = StartDate;
	}

	public Date getEndDate() {
		return this.EndDate;
	}

	public void setEndDate(Date endDate) {
		this.EndDate = EndDate;
	}
}