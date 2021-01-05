package com.testproject.testing.service;

import com.testproject.testing.entity.Student;
import com.testproject.testing.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return this.studentRepository.findAll();
    }

}
