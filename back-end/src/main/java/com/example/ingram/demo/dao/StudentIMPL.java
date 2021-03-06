package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentIMPL implements StudentDAO {

    private final EntityManager entityManager;

    @Autowired
    public StudentIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Student> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Student> studentData = currentSession.createQuery("from Student");

        return studentData.getResultList();
    }

    @Override
    @Transactional
    public Student saveOrUpdate(Student theStudent) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theStudent);
        return theStudent;
    }

    @Override
    @Transactional
    public Student findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Student.class, theId);
    }

    @Override
    @Transactional
    public String deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Student tempStudent = currentSession.get(Student.class, theId);
        String failureMessage = "Student not found with id: "
                + theId
                + " \nPlease try again. :)";
        try {
            if(tempStudent == null) {
                throw new Exception(failureMessage);
            }
            currentSession.delete(tempStudent);
            return "You have successfully deleted the student with ID: " + theId;
        } catch (Exception e) {
            e.printStackTrace();
            return failureMessage;
        }
    }
}
