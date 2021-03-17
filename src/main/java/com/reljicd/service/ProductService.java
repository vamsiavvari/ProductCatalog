package com.reljicd.service;

import java.util.List;
import java.util.Optional;

import com.reljicd.model.Product;

public interface ProductService {

    Optional<Product> findById(Long id);

    List<Product> findAllProducts();
    
    Product addProduct(Product product);

}
