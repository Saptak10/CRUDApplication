package com.example.Application.Service.Implementation;

import com.example.Application.Entity.Student;
import com.example.Application.Repository.StudentRepository;
import com.example.Application.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(int id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.isPresent()? optionalStudent.get() : null;
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }

//    @Override
//    public int getCountByFirstName(String firstName){
//        return studentRepository.countAllUsers(firstName);
//    }
}
