package com.egesua.restApi.controller;

import com.egesua.restApi.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    private Map<Long, Student> students = new HashMap<>();

    @PostMapping
    public Student save(@RequestBody Student student) {
        students.put(student.getId(), student);
        return student;
    }

    @GetMapping
    public List<Student> findAll() {
       return students.values().stream().toList();
    }

}
