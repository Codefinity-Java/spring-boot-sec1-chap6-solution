package com.codefinity.springbootexmshop.service;

import com.codefinity.springbootexmshop.model.Product;
import com.codefinity.springbootexmshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
       return productRepository.findAllProduct();
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }
}
