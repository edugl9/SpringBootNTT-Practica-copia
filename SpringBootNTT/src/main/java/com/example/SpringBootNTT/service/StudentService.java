package com.example.SpringBootNTT.service;

import com.example.SpringBootNTT.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>(List.of(new Student(1, "Jose"),
            new Student(2, "Maria")));

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(String studentName){
        for (Student s:students) {
            if(studentName.equals(s.getName())){
                return s;
            }
        }
        return new Student("Alumno no encontrado");
    }

    public List<Student> getLista() {
        return students;
    }
}
