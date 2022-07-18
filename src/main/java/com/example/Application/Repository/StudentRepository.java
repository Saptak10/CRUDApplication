package com.example.Application.Repository;

import com.example.Application.Entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

//    List<Student> findByFirstName(String firstName);
//
//    List<Student> findByFirstNameOrLastName(String firstName, String lastName);
//    @Query(value = "SELECT COUNT(I) FROM student WHERE first_name = :firstName", nativeQuery = true)
//    int countAllUsers(String firstName);
}
