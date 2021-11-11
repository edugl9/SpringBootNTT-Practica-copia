package com.example.SpringBootNTT.controller;

import com.example.SpringBootNTT.entity.Student;
import com.example.SpringBootNTT.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/{nombre}")
    public String holaMundo(@PathVariable String nombre){
        return "Hola mundo" + nombre;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    public Student getStudentByName(@PathVariable("nombreVariable") String name){
        return service.getStudent(name);
    }

    @GetMapping("/homepage")
    public String homepage(Model model){
        model.addAttribute("yoSoy", "eduardo");
        return "home";
        //model.addAllAttributes("students");
    }
}
