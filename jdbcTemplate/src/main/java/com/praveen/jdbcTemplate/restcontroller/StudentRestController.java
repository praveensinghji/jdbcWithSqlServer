package com.praveen.jdbcTemplate.restcontroller;

import com.praveen.jdbcTemplate.model.Student;
import com.praveen.jdbcTemplate.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    private StudentRepo repo;

    @GetMapping("/students")
    public List<Student> findAllStudnet(){
        return repo.findAllStudent();
    }

    //Here I am creating for postman for inserting that Request Body.
    @PostMapping("/student")
    public String save(@RequestBody Student student){
        return repo.saveStudent(student);
    }

    @GetMapping("/student/{name}")
    public Student getStudentByName(@PathVariable String name){
        return repo.getStudentByName(name);
    }

    @GetMapping("/student")
    public Student getStudentByNameMethod2(@RequestBody String name){
        return repo.getStudentByName(name);
    }

    @GetMapping("/delete/{name}")
    public String deleteByName(@PathVariable String name){
        repo.deleteById(name);
        return "Delete Successfully";
    }

}
