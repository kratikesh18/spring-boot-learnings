package com.kratikesh.RESTCRUD.REST;

import com.kratikesh.RESTCRUD.entity.Employee;
import com.kratikesh.RESTCRUD.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {
    private EmployeeService employeeService;

    //constructor injection of the dao
    @Autowired
    public EmployeeRESTController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }


    @GetMapping("/employees")
    public List<Employee>findAll(){
        return employeeService.findAll();
    }

}
