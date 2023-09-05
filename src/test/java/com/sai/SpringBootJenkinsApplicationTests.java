package com.sai;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
    private static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("Executing TestCase...");
        assertEquals(true,true);
    }

}
