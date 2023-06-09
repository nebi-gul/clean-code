package org.etiya.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    int id;
    String name;
    String surname;
    int age;
    String nationalityId;
    List<Book> books;


}
