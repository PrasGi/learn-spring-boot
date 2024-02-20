package prasetyoputrapratama.spring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import prasetyoputrapratama.spring.core.data.Connection;

public class LifeCycleTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    public void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    public void tearDown() {
        // applicationContext.close();
    }

    @Test
    public void testConnection() {
        Connection conenction = applicationContext.getBean("connection", Connection.class);
    }
}
