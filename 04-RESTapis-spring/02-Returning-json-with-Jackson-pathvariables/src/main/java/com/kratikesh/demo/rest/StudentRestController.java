package com.kratikesh.demo.rest;

import com.kratikesh.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //using the proper methods
    private List<Student> studentList;

    //defining @PostContruct to load the students data
    @PostConstruct()
    public void loadData(){

        studentList = new ArrayList<>();

        studentList.add(new Student("Kartikesh", "Pachkawade"));
        studentList.add(new Student("Pratiksha", "Malewar"));
        studentList.add(new Student("Prajakta", "Koli"));
    }

    //defining endpoint for "/student" and returning all students
    @GetMapping("/students")
    public List<Student> getStudents(){

        return studentList;
    }


    //defining endpoint for "/student/{studentID}" which returns the student at index
    @GetMapping("/students/{studentID}")
    public Student getStudentById(@PathVariable int studentID){

        //checking if the id is in bound or not if not then throwing the custom error
        if(studentID >= studentList.size() || studentID < 0 ){
            throw new StudentNotFoundException("Student not found with id: " + studentID);
        }
        //else the happy code will execute
        return studentList.get(studentID);
    }


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (StudentNotFoundException exc){
        //create  a studentErrorREsponse
        StudentErrorResponse err = new StudentErrorResponse();
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(exc.getMessage());
        err.setTimeStamp(System.currentTimeMillis());

        //return response entity

        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    //exception handler for any other exception occurs ... to catch all
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
        StudentErrorResponse err = new StudentErrorResponse();
        err.setStatus(HttpStatus.BAD_REQUEST.value());
//        err.setMessage(exc.getMessage());
        err.setMessage("Input is need to be Integer , try again with integer value : " + exc.getLocalizedMessage());
        err.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

    }
}
