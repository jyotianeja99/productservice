package com.dg.productservice.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public void getAllProducts(){

    }

    @GetMapping("{id}")
    public String getProductById(@PathVariable Long id){
        return "Here is the product found : "+id;

    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

    @PostMapping
    public String createProduct(){
        return "Created product with id "+ UUID.randomUUID();

    }

    @PutMapping("{id}")
    public void updateProductById(){

    }



}
