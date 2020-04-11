package com.example.demo;

import com.example.demo.Service.PersonSercive;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private PersonSercive personSercive;

	@Test
	void contextLoads() {
		System.out.println(personSercive.selectAll());
	}

}
