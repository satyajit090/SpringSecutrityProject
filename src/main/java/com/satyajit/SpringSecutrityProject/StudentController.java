package com.satyajit.SpringSecutrityProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students=new ArrayList<>(List.of(
            new Student(1,"satya",65),
            new Student(2,"unknown",45)
    ));

    @GetMapping("/students")
    public List<Student> getStudent(){
        return students;
    }
}
