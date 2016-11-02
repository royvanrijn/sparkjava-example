package com.hydra.spark.sample.controller;

import com.google.inject.Inject;
import com.hydra.spark.sample.persistence.dao.PersonDao;
import com.hydra.spark.sample.persistence.domain.Person;

public class PersonController {

    @Inject
    PersonDao personDao;

    public Person getById(Integer id){
        return personDao.find(id);
    }
    
    public Person add(String name, String address, String phone) {
        return personDao.save(name, address, phone);
    }

}
