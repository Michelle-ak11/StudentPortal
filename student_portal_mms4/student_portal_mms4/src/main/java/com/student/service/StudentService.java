package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import java.util.List; 
import org.springframework.stereotype.Service;

@Service
public class StudentService{
  private final StudentRepository studentRepository;

public StudentService(StudentRepository studentRepository){
  this.studentRepository = studentRepository;
  }

public List<Student> getAllSudent(){
  return studentRepository.findAll();
  }

public Student getSudent(Long id){
  return studentRepository.findById(id).orElseThrow();
   }


public Student saveSudent(Student student){
  return studentRepository.save(student);
  }

public void deleteStudent(Long id){
  studentRepository.deleteById(id);
  }

}