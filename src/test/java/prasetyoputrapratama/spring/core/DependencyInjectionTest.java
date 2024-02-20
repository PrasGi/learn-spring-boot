package prasetyoputrapratama.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import prasetyoputrapratama.spring.DependencyInjectionConfiguration;
import prasetyoputrapratama.spring.core.data.Bar;
import prasetyoputrapratama.spring.core.data.Foo;
import prasetyoputrapratama.spring.core.data.FooBar;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDependencyInjection() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertEquals(foo, fooBar.getFoo());
        Assertions.assertEquals(bar, fooBar.getBar());
    }
    
    @Test
    void testNoDependencyInjection() {
        Foo foo = new Foo();
        Bar bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertEquals(foo, fooBar.getFoo());
        Assertions.assertEquals(bar, fooBar.getBar());
    }
}
