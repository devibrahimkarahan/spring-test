package com.test.demo.service;

import com.test.demo.repository.PersonDao;
import com.test.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public List<Person> getAllPersons() {
        return personDao.findAll();
    }

    public List<Person> getPersonsByName(String name) {
        return personDao.getPersonsByName(name);
    }

    public Person save(Person person) {
        return personDao.save(person);
    }

}
