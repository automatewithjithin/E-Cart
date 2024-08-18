package com.jithinjosects.ecart;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepo {
    List<Product>productsList = new ArrayList<>();
    public CartRepo(){
        productsList.add(new Product(1,"Samsung S24 Ultra","Mobile",100000));
        productsList.add(new Product(2,"Lenovo","Laptop",50000));
        productsList.add(new Product(3,"Logitech","keyboard",1000));
        productsList.add(new Product(4,"Zeb-Envy","Head Phone",1500));
    }
    public List<Product> getAllProducts() {
        return productsList;
    }
}
