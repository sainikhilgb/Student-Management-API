package com.StudentManagement.Student_Management_API.Repository;

import com.StudentManagement.Student_Management_API.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StdentRepository extends JpaRepository<Student, Integer> {
}
