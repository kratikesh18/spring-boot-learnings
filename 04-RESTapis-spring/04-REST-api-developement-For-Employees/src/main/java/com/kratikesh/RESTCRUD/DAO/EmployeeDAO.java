package com.kratikesh.RESTCRUD.DAO;

import com.kratikesh.RESTCRUD.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
