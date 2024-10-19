package com.kratikesh.demo.rest;

import com.kratikesh.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    //defining endpoint for "/student" and returning all students
    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kartikesh", "Pachkawade"));
        studentList.add(new Student("Pratiksha", "Malewar"));
        studentList.add(new Student("Prajakta", "Koli"));

        return studentList;
    }

}
