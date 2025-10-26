package com.StudentManagement.Student_Management_API.Services;

import com.StudentManagement.Student_Management_API.Models.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    List<Student> getAllStudents();
    Optional<Student> getStudentById(int id);
    Student addStudent(Student student);
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);
}
