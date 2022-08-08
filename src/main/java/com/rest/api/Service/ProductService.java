package com.rest.api.Service;

import com.rest.api.Entity.Product;

public interface ProductService {
    // Dapat di tuliskan method" apa saja yg dapat di lakukan pada product service

    // get product berdasarkan id
    Product getProduct(Long id);

    Iterable<Product> getAllProduct();

    Product addProduct(Product product);
}
