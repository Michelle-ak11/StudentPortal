 package com.student.controller;
 
import com.student.model.Student;
import com.student.service.StudentService;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.*;
 import java.util.List;

  @RestController
  @RequestMapping("/students")
  public class StudentController{

    private final StudentService studentService;
  
    public StudentController(StudentService studentService){
    this.studentService = studentService;
   }

   @GetMapping
   public List<Student> getStudent(){
   return studentService.getAllStudent();
  }



@PostMapping
public Student createStudent(@RequestBody Student student){
  return studentService.saveStudent(student);
  }

}