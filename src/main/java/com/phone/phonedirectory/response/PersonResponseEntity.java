// All Rights Reserved, Copyright © Phone Com Limited. For more information see LICENSE

package com.phone.phonedirectory.response;

import com.phone.phonedirectory.core.model.dto.Person;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonResponseEntity {
  private List<Person> personList;
  private String message;
  private String errorMessage;
}
