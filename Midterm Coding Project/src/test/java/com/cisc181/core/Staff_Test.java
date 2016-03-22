package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	@SuppressWarnings("deprecation")
	private static ArrayList<Staff> x;
	private static Date DOB;
	private static Date hire;
	@BeforeClass
	public static void setup() throws Exception{
	
		x.add(new Staff("John", "Jacob", "Willias", DOB(1900, 12, 25), "Computer St", "(302)-302-0302",
				"jjw@udel.edu", "9am", 100, 10000.00, hire(1950, 12, 25), eTitle.MR));
		x.add(new Staff("John", "Jacob", "Willias", DOB(1900, 12, 25), "Computer St", "(302)-302-0302",
				"jjw@udel.edu", "9am", 100, 20000.00, hire(1950, 12, 25), eTitle.MR));
		x.add(new Staff("John", "Jacob", "Willias", DOB(1900, 12, 25), "Computer St", "(302)-302-0302",
				"jjw@udel.edu", "9am", 100, 30000.00, hire(1950, 12, 25), eTitle.MR));
		x.add(new Staff("John", "Jacob", "Willias", DOB(1900, 12, 25), "Computer St", "(302)-302-0302",
				"jjw@udel.edu", "9am", 100, 40000.00, hire(1950, 12, 25), eTitle.MR));
		x.add(new Staff("John", "Jacob", "Willias", DOB(1900, 12, 25), "Computer St", "(302)-302-0302",
				"jjw@udel.edu", "9am", 100, 50000.00, hire(1950, 12, 25), eTitle.MR));
	}

	@Test
	public void test() {
		double total = 0.0;
		for (Staff sal: x){
			total+=sal.getSalary();
		}
		double average_salary = total/5;
		assertEquals(average_salary, 30000,.2);
	}
	@Test
	public void test1() throws Exception{
		new Staff("John", "Jacob", "Willias", DOB(2000, 12, 25), "Computer St", "(215)-302-0302",
				"jjw@udel.edu", "9am", 100, 50000.00, hire(1950, 12, 25), eTitle.MR);
	}
	

}






