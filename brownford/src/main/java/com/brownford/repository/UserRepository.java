package com.brownford.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brownford.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    Optional<User> findTopByRoleOrderByStudentIdDesc(String role);

    Optional<User> findTopByRoleOrderByFacultyIdDesc(String role);

    Optional<User> findByStudentId(String studentId);
}