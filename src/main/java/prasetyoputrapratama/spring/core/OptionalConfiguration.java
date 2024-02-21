package prasetyoputrapratama.spring.core;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prasetyoputrapratama.spring.core.data.Bar;
import prasetyoputrapratama.spring.core.data.Foo;
import prasetyoputrapratama.spring.core.data.FooBar;

@Configuration
public class OptionalConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
