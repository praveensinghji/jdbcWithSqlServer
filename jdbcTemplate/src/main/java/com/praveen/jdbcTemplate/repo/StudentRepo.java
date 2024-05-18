package com.praveen.jdbcTemplate.repo;

import com.praveen.jdbcTemplate.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> findAllStudent(){
        String sql = "SELECT * FROM ftwdbo.Student";
        List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
        System.out.println(students);
        return students;
    }

    public String saveStudent(Student student){
        String sql = "INSERT INTO ftwdbo.Student (name,email,department) VALUES (?,?,?);";
        jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getDepartment());
        return "Data Saved Successfully";
    }

    public Student getStudentByName(String name){
        String sql = "SELECT * FROM ftwdbo.Student where name = ?";
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Student.class),name);
    }

    public void deleteById(String name){
        String sql = "DELETE FROM ftwdbo.Student where name=?";
        jdbcTemplate.update(sql,name);
    }

}
