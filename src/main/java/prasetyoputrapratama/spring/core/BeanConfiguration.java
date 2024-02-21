package prasetyoputrapratama.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import prasetyoputrapratama.spring.core.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {
    
    @Bean (value = "fooFirst")
    public Foo foo1() {
        Foo foo = new Foo();
        log.info("Create new foo 1");
        return foo;
    }

    @Bean (value = "fooSecond")
    public Foo foo2() {
        Foo foo = new Foo();
        log.info("Create new foo 2");
        return foo;
    }
}
