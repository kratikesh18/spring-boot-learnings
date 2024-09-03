package com.kratikesh.cruddemo;

import com.kratikesh.cruddemo.DAO.StudentDAO;
import com.kratikesh.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runnner -> {
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			readStudentsData(studentDAO);
		};
	}

	private void readStudentsData(StudentDAO studentDAO) {
		//creating the student object
		System.out.println("Creating the Student object....");
		Student tempStudent = new Student("Kartikesh", "Pachkawade" , "iloveherpussy@got.com");

		//saving the object
		System.out.println("Saving the object to the Database");
		studentDAO.save(tempStudent);

		//displaying the objectid
		int theId = tempStudent.getId();
		System.out.println("Object Saved successfully, Generated Id: "+ theId );

		//retrieving data based on the id
		System.out.println("retrieving data by id ... "+ theId );
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Student Data found... " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		//creating multiple students
		System.out.println("Creating Multiple students");
		Student tempStudent1 = new Student("Pratiksha", "Pachkawade", "pratikshaloveskartikesh@gmail.com");
		Student tempStudent2 = new Student("Gayatri" , "Katole", "gayatrikatole12@gmail.com");
		Student tempStudent3 = new Student("Prajakta", "Koli", "iknowkartikesh@gmail.com");
		Student tempStudent4 = new Student("Darshana", "kakade", "idolooklikemithila@gmail.com");

		System.out.println("Saving multiple students");
		//save the multiple students to db
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

		System.out.println("Saved multiple students");
	}

	private void createStudent(StudentDAO studentDAO) {
		//creating the student object
		System.out.println("Creating the Student object....");
		Student tempStudent = new Student("Kartikesh", "Pachkawade" , "kartikpachkawade@gmail.com");

		//saving the object
		System.out.println("Saving the object to the Database");
		studentDAO.save(tempStudent);

		//displaying the objectid
		System.out.println("Object Saved successfully, Generated Id: "+ tempStudent.getId() );
	}


}
