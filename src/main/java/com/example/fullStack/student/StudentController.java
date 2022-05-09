package com.example.fullStack.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/students")
@AllArgsConstructor
public class StudentController {
//    @AllArgsConstructor 等价于
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
    private final StudentService studentService;


    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllSudents();
    }

//    @GetMapping
//    public List<Student> getAllStudents() {
//        List<Student> students = Arrays.asList(
//                new Student(1L,"申世奇","shenshiqi@gmail.com", Gender.Male),
//                new Student(1L,"池晟","chisheng@gmail.com", Gender.Female)
//        );
//        return students;
//    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);

    }
}
