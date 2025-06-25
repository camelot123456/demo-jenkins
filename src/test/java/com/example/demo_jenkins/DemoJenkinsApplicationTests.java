package com.example.demo_jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
class DemoJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test case executing...");
		assertEquals(true, true);
	}

}
