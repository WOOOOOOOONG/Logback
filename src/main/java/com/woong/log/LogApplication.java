package com.woong.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication {

	public static void main(String[] args) {
		testLogback();
		SpringApplication.run(LogApplication.class, args);
	}

	public static void testLogback() {
		Logger logger = LoggerFactory.getLogger(LogApplication.class);

		logger.info("Logback + slf4j 조합 테스트 start");
		try {
			logger.debug("Performing task");
			throw new Exception();
		} catch (Exception e) {
			logger.error("An error occurred while performing the task", e);
		}
		logger.info("Logback + slf4j 조합 테스트 end");
	}

}
