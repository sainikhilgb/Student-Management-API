package com.StudentManagement.Student_Management_API.Services;

import com.StudentManagement.Student_Management_API.Exceptions.StudentNotFoundException;
import com.StudentManagement.Student_Management_API.Models.Student;
import com.StudentManagement.Student_Management_API.Repository.StdentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private final StdentRepository stdentRepository;
    @Autowired
    public StudentService(StdentRepository stdentRepository) {
        this.stdentRepository = stdentRepository;
    }

    public List<Student> getAllStudents() {

        return stdentRepository.findAll();
    }


    public Optional<Student> getStudentById(int id) {
        Optional<Student> student = stdentRepository.findById(id);
        if(student == null){
            throw  new StudentNotFoundException("Student not found with id: " + id);
        }
        return stdentRepository.findById(id);
    }


    public Student addStudent(Student student) {
       return stdentRepository.save(student);
    }


    public Student updateStudent(int id, Student updatedStudent) {
        return stdentRepository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setSurname(updatedStudent.getSurname());
                    student.setEmail(updatedStudent.getEmail());
                    return student; // return the updated student
                })
                .map(stdentRepository::save) // save updated student
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
    }


    public void deleteStudent(int id) {
        stdentRepository.deleteById(id);

    }

}
