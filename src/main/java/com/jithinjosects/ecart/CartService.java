package com.jithinjosects.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepo repo;

    public ResponseEntity<List<Product>> getALlProducts() {
        try {
            return new ResponseEntity<>(repo.getAllProducts(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Product> getProductById(int id) {
        try {
            return new ResponseEntity<>(repo.getProductById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    public ResponseEntity<List<Product>> getProductsByCategory(String category) {
        try {
            return new ResponseEntity<>(repo.getProductsByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);



    }

    public ResponseEntity<String> addNewProduct(Product product) {
        repo.addNewProduct(product);
        return new ResponseEntity<>("Product added successfully",HttpStatus.CREATED);

    }
}

