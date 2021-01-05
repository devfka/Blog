package com.testproject.testing.controller;

import com.testproject.testing.entity.StudentDTO;
import com.testproject.testing.mapper.StudentMapper;
import com.testproject.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentDTO>> getStudents() {

        List<StudentDTO> students = StudentMapper.mapToDTO(studentService.getAllStudent());

        return new ResponseEntity<>(students, HttpStatus.OK);

    }

}
