package prasetyoputrapratama.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "prasetyoputrapratama.spring.core.repository",
    "prasetyoputrapratama.spring.core.services",
})
public class ComponentConfiguration {
    
}
