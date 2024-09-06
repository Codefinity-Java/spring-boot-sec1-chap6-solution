package com.codefinity.springbootexmshop.repository;

import com.codefinity.springbootexmshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>(
            List.of(
                    new Product(200, "product1"),
                    new Product(100, "product2"),
                    new Product(300, "product3")
            )
    );

    public List<Product> findAllProduct() {
        return products;
    }

    public Product findByName(String name){
        //TODO: Find `Product` by name in `products`
        return null;
    }
}
