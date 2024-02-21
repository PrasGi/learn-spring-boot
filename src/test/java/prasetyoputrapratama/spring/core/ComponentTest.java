package prasetyoputrapratama.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import prasetyoputrapratama.spring.core.repository.ProductRepository;
import prasetyoputrapratama.spring.core.services.ProductService;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }
    
    @Test
    void testComponent() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);

        Assertions.assertNotNull(context);

        ProductService productService = context.getBean("productService", ProductService.class);

        Assertions.assertNotNull(productService);
    }

    @Test
    void testConstructorDI() {
        ProductService productService = applicationContext.getBean("productService", ProductService.class);
        ProductRepository productRepository = applicationContext.getBean("productRepository", ProductRepository.class);

        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }
}
