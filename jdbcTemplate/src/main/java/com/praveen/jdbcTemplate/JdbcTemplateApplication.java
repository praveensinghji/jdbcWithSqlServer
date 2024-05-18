package com.praveen.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.yaml.snakeyaml.comments.CommentLine;

import java.util.List;
import java.util.Map;

@SpringBootApplication     //implements with CommandLineRunner
public class JdbcTemplateApplication {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "SELECT * FROM ftwdbo.Student";
//		List<Map<String, Object>> data =  jdbcTemplate.queryForList(sql);
//		System.out.println(data);
//	}
}
