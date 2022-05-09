package com.example.fullStack.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service    // 可以用 dependency injector 去 引入 class
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllSudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        // check if email is taken
        studentRepository.save(student);
    }
}

