package com.test.demo.repository;

import com.test.demo.domain.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

    @Query(nativeQuery = true, value = "SELECT p.* FROM person p WHERE p.name LIKE %?1%")
    List<Person> getPersonsByName(String personName);

    @Override
    List<Person> findAll(Sort sort);
}
