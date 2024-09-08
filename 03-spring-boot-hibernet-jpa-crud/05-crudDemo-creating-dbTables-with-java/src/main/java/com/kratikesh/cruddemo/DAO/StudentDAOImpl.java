package com.kratikesh.cruddemo.DAO;

import com.kratikesh.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Student> findAll(){
        //creating the query                                          // this query is writtedn in JPQL & JPQL is based on entiry not actual DB entries
        //TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        //another query for ordering the result by lastName (by default ascending order)
        //TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);

        //for descending order
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName desc", Student.class);
        //returning the query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        //create a query
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "from Student where lastName=:theData", Student.class);

        //set Query parameter
        theQuery.setParameter("theData", theLastName);

        //return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        //retrieve the student
        Student studentToDelete = entityManager.find(Student.class, id);

        //deleting the student
        entityManager.remove(studentToDelete);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numberOfRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numberOfRowsDeleted;
    }


}
