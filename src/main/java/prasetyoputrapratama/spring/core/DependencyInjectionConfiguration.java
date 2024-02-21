package prasetyoputrapratama.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prasetyoputrapratama.spring.core.data.Bar;
import prasetyoputrapratama.spring.core.data.Foo;
import prasetyoputrapratama.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean (value = "foo")
    public Foo foo() {
        return new Foo();
    }

    @Bean (value = "bar")
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("foo") Foo foo, @Qualifier("bar") Bar bar) {
        return new FooBar(foo, bar);
    }
}
