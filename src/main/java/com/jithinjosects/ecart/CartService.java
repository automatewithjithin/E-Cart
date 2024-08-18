package com.jithinjosects.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepo repo;
    public List<Product> getALlProducts() {
        return repo.getAllProducts();
    }

    public Product getProductById(int id) {
        return repo.getProductById(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return repo.getProductsByCategory(category);
    }
}
