package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentIMPL implements StudentDAO{

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
    public Object save(Student theStudent) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theStudent);
        return null;
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(int theId) {

    }
}
