package com.TechEazy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TechEazy.model.Response;
import com.TechEazy.model.Student;
import com.TechEazy.repo.SubjectRepo;
import com.TechEazy.service.StudentService;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectRepo subjectRepo;

    @PostMapping(value = "/api/student")
    public ResponseEntity<Response> addStudent(@RequestBody Student student ){
    Student student1 =studentService.addStudent(student);
   return ResponseEntity.status(200)
           .body(new Response("200","successfully created student"));
    }





}
