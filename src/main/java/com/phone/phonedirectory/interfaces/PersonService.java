// All Rights Reserved, Copyright © Phone Com Limited. For more information see LICENSE

package com.phone.phonedirectory.interfaces;

import com.phone.phonedirectory.response.PersonResponseEntity;
import org.springframework.http.ResponseEntity;

public interface PersonService {
  ResponseEntity<PersonResponseEntity> getPerson(String personName) throws Exception;
}