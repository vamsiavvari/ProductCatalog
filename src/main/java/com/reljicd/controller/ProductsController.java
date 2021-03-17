package com.reljicd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reljicd.model.Product;
import com.reljicd.service.ProductService;

@RestController
public class ProductsController {


    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> allProducts() {
    	List<Product> products = productService.findAllProducts();
        return products;
    }
    
    @PostMapping("/addProduct")
    @ResponseBody
    public void addNewItem(@RequestBody Product product) {
    	productService.addProduct(product);
    }

}
