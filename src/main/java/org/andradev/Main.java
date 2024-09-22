package org.andradev;

import org.andradev.domain.Course;
import org.andradev.domain.Mentorship;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setTitle("Java course");
		course1.setDescription("Basics of Java programming");
		course1.setWorkload(8);
		
		Course course2 = new Course();
		course2.setTitle("JavaScript course");
		course2.setDescription("Basics of JavaScript programming");
		course2.setWorkload(9);
		
		Mentorship mentorship = new Mentorship();
		mentorship.setTitle("Java mentorship");
		mentorship.setDescription("A mentorship on the intrinsics of Java code");
		mentorship.setDate(LocalDate.now());
		
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(mentorship);
	}
}