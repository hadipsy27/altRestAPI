package com.rest.api.Service;

import com.rest.api.Entity.Product;
import com.rest.api.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
