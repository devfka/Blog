package com.testproject.testing.mapper;

import com.testproject.testing.entity.Student;
import com.testproject.testing.entity.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentMapper {

    public static List<StudentDTO> mapToDTO(List<Student> studentlist) {

        List<StudentDTO> studentDTOList = new ArrayList<>();
        studentlist.forEach(student -> {
            studentDTOList.add(StudentDTO.builder()
                    .id(student.getId())
                    .name(student.getName()).build());
        });

        return studentDTOList;

    }
}
