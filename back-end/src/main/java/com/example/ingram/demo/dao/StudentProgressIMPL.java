package com.example.ingram.demo.dao;

import com.example.ingram.demo.entity.Student;
import com.example.ingram.demo.entity.StudentProgress;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentProgressIMPL implements StudentProgressDAO {

    private final EntityManager entityManager;

    @Autowired
    public StudentProgressIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query progress = currentSession.createQuery("from StudentProgress");
        return progress.getResultList();
    }

    @Override
    public StudentProgress findById(int progressId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(StudentProgress.class, progressId);
    }

    @Override
    @Transactional
    public StudentProgress saveOrUpdate(StudentProgress progress) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(progress);
        return progress;
    }
}
