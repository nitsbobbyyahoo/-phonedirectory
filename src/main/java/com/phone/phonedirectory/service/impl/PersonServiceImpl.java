// All Rights Reserved, Copyright © Phone Com Limited. For more information see LICENSE

package com.phone.phonedirectory.service.impl;

import com.phone.phonedirectory.core.model.dto.Person;
import com.phone.phonedirectory.interfaces.PersonService;
import com.phone.phonedirectory.repository.PersonRepository;
import com.phone.phonedirectory.response.PersonResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

  @Autowired
  PersonRepository personRepository;

  @Override
  public ResponseEntity<PersonResponseEntity> getPerson(String personName) throws Exception {

    PersonResponseEntity phoneResponseEntity = new PersonResponseEntity();

    if (null == personName || personName.equals("")) {
      log.info("Search string is empty");
      phoneResponseEntity.setErrorMessage("Search string is empty");
      return ResponseEntity.badRequest().body(phoneResponseEntity);
    }

    try {
      List<Person> personList = personRepository.find(personName);//All().forEach(person -> personList.add(person));
      if (personList.isEmpty()) {
        log.info("No matching record found for: " + personName);
        phoneResponseEntity.setErrorMessage("No matching record found for: " + personName);
      }
      phoneResponseEntity.setPersonList(personList);
    } catch (Exception exp) {
      log.info("Exception occurred while accessing data from DB.");
      phoneResponseEntity.setErrorMessage("Exception occurred while accessing data from DB.");
      return ResponseEntity.badRequest().body(phoneResponseEntity);
    }

    return ResponseEntity.accepted().body(phoneResponseEntity);
  }
}
