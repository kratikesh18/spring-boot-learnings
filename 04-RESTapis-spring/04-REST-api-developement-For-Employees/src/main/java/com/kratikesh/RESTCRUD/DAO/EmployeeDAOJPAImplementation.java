package com.kratikesh.RESTCRUD.DAO;

import com.kratikesh.RESTCRUD.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJPAImplementation implements EmployeeDAO{
    //define a field for entity manager
    public  EntityManager entityManager;

    //Setting up a constructor injection
    @Autowired
    public EmployeeDAOJPAImplementation(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);

        //execute the query and get the results
        List<Employee> employeeResultList = theQuery.getResultList();
        //return the results
        return employeeResultList;

    }
}
