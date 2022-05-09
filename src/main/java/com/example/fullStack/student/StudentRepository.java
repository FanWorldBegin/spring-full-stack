package com.example.fullStack.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 表类型 和 ID

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
