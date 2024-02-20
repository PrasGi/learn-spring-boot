package prasetyoputrapratama.spring.core.services;

import org.springframework.stereotype.Component;

import lombok.Getter;
import prasetyoputrapratama.spring.core.repository.ProductRepository;

@Component
public class ProductService {
    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
