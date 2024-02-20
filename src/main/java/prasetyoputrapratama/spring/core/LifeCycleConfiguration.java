package prasetyoputrapratama.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prasetyoputrapratama.spring.core.data.Connection;

@Configuration
public class LifeCycleConfiguration {
    
    @Bean (value = "connection")
    public Connection connection() {
        return new Connection();
    }
}
