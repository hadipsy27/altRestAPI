package com.rest.api.Controller;

import com.rest.api.Entity.Category;
import com.rest.api.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping
    public Object getAllData(){
        return categoryRepository.findAll();
    }

    @PostMapping
    public Category addCategory(@RequestBody Category categoryPayload){
        return categoryRepository.save(categoryPayload);

    }

    @DeleteMapping("/{id}")
    public Optional<Category> deleteById(@PathVariable Long id){
        Optional<Category> categoryById = categoryRepository.findById(id);
        categoryById.ifPresent(category -> {
            categoryRepository.deleteById(id);
        });

        return categoryById;
    }
}
