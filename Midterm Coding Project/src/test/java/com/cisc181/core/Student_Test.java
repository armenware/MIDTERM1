package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
public class Student_Test {
private static ArrayList<Course> cs;
private static ArrayList<Semester> sm;
private static ArrayList<Section> sc;
private static ArrayList<Student> st;
	@BeforeClass
	public static void setup() {
		cs.add(new Course(UUID.randomUUID(), "ECON101", 100, "Business"));
		cs.add(new Course(UUID.randomUUID(), "CISC181", 100, "Compsi"));
		cs.add(new Course(UUID.randomUUID(), "CHEM103", 100, "Chem"));
	    sm.add(new Semester (UUID.randomUUID(), Date(2000, 12, 25), new Date(2000, 10, 31));
		sm.add(new Semester (UUID.randomUUID(), Date(2010, 12, 25), new Date(2010, 10, 31)));
		sc.add(new Section (UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 100));
		sc.add(new Section (UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 200));
		sc.add(new Section (UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 101));
		sc.add(new Section (UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 202));
		sc.add(new Section (UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 103));
		sc.add(new Section (UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 203));
	}

	@Test
	public void test() {
		st.setMajor("Business");
	}
}