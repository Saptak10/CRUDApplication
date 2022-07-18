package com.example.Application.Service;

import com.example.Application.Entity.Student;
public interface StudentService {
    Student getStudent(int id);

//    int getCountByFirstName(String firstName);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
