package com.kratikesh.RESTCRUD.services;

import com.kratikesh.RESTCRUD.DAO.EmployeeDAO;
import com.kratikesh.RESTCRUD.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    //creating the dao for the service layer
    private final EmployeeDAO employeeDAO;

    //constructor injection of the dao
    @Autowired
    public EmployeeServiceImplementation(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
