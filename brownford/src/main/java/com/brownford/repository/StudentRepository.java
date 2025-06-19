package com.brownford.repository;

import com.brownford.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentId(String studentId);

    Optional<Student> findTopByOrderByStudentIdDesc();
}
