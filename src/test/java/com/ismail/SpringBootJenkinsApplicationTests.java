package com.ismail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
	
	private final Logger logger=LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	@Test
	public void contextLoads() {
		logger.info("Test logging three from test class......");
		logger.info("Test logging four from test class second time.........");
		logger.info("Test logging four from test class Third time on 22/7/2026.........");
		logger.info("Test logging final from test class on 22/7/2026 email notification testing.........");
		logger.info("Test Pipeline automated...Ismail...");
		assertEquals(true, true);
	}

}
