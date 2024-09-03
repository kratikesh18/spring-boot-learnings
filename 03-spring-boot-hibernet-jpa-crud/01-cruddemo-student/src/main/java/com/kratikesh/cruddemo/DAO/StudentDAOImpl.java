package com.kratikesh.cruddemo.DAO;

import com.kratikesh.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //defining entity manager
     private EntityManager entityManager;

    //injecting entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implementing save method
    @Override
    @Transactional          //transactional annotation because we are performing DB operation here
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override    // no need of transactional annotation because its only a retrieving query
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }
}
