package com.phone.phonedirectory.repository;

import com.phone.phonedirectory.core.model.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

  @Query("select p from Person p where p.name like %?1%")
  public List<Person> find(@Param("personName") String personName);
}
