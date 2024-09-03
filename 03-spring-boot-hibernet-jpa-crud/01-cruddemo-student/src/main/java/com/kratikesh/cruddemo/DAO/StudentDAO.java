package com.kratikesh.cruddemo.DAO;

import com.kratikesh.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);
}
