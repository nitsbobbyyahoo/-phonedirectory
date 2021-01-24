// All Rights Reserved, Copyright © Phone Com Limited. For more information see LICENSE

package com.phone.phonedirectory.web.rest.controller;

import com.phone.phonedirectory.interfaces.PersonService;
import com.phone.phonedirectory.response.PersonResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/person")
public class PersonDirectoryController {

  private final PersonService personService;

  @Autowired
  public PersonDirectoryController(PersonService personService) {
    this.personService = personService;
  }

  @RequestMapping(value = "/getperson", method = RequestMethod.GET)
  public ResponseEntity<PersonResponseEntity> getPerson(@RequestParam(required = false) String personName)
      throws Exception {
    return personService.getPerson(personName);
  }

}
