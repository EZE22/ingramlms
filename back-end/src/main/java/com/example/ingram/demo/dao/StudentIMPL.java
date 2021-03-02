package com.example.ingram.demo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentIMPL implements StudentDAO{
    //TODO add the entity manager / Constructor Injection 


    @Override
    @Transactional
    public List<Object> findAll() {
        return null;
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        return null;
    }

    @Override
    @Transactional
    public void save(Object theEmployee) {

    }

    @Override
    @Transactional
    public void deleteById(int theId) {

    }
}
