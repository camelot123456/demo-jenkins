package com.example.demo_jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
class DemoJenkinsApplicationTests {

	@Test
	contextLoads() {
		log.info("Test case executing...");
		log.info("Images Loading...");
		log.info("Containers Loading...");
		assertEquals(true, true);
	}

}
