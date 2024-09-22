package org.andradev;

import org.andradev.domain.*;

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
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescription("Bootcamp Java Developer - From 0 to 1");
		bootcamp.getContents().add(course1);
		bootcamp.getContents().add(course2);
		bootcamp.getContents().add(mentorship);
		
		Dev willDev = new Dev();
		willDev.setName("Willian");
		
		willDev.subscribeBootcamp(bootcamp);
		
		willDev.progress();
		willDev.progress();
		
		System.out.println("Conteúdos Inscritos Willian: " + willDev.getSubscribedContent());
		System.out.println("Conteúdos Concluídos Willian: " + willDev.getFinishedContents());
		System.out.println("XP: " + willDev.calculateTotalXP());
		
		Dev johnDev = new Dev();
		johnDev.setName("John");
		
		johnDev.subscribeBootcamp(bootcamp);
		
		johnDev.progress();
		johnDev.progress();
		johnDev.progress();
		
		System.out.println("Conteúdos Inscritos John: " + johnDev.getSubscribedContent());
		System.out.println("Conteúdos Concluídos John: " + johnDev.getFinishedContents());
		System.out.println("XP: " + johnDev.calculateTotalXP());
	}
}