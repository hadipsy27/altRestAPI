package com.rest.api.Controller;

import com.rest.api.Entity.Product;
import com.rest.api.Repository.ProductRepository;
import com.rest.api.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    Product getProductById(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }

    @GetMapping
    Object getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping
    Product createProduct(@RequestBody Product productPayload){
        Product product = productService.addProduct(productPayload);
        return product;
    }
}
