package com.example.baseproject.repository;

import com.example.baseproject.entity.Department;
import com.example.baseproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query
    List<Student> findAllByEnableTrue();
}
