package org.my.group.service;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.my.group.domain.Product;
import org.my.group.infrastructure.ProductRepository;

@ApplicationScoped
public class ProductService {

    @Inject
    private ProductRepository productRepository;

    @Transactional
    public void addProduct(Product product) {
            productRepository.persist(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.listAll();
    }
}
