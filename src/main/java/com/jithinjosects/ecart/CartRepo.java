package com.jithinjosects.ecart;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CartRepo {
    List<Product>productsList = new ArrayList<>();
    public CartRepo(){
        productsList.add(new Product(1,"Samsung S24 Ultra","Mobile",100000,List.of("12GB","128GB","Black")));
        productsList.add(new Product(2,"Lenovo","Laptop",50000, List.of("12GB","512GB","White")));
        productsList.add(new Product(3,"Logitech","Keyboard",1000,List.of("Optical","Black")));
        productsList.add(new Product(4,"Zeb-Envy","Head Phone",1500,List.of("Bluetooth","Volume Control")));
        productsList.add(new Product(5,"Vivo X 60","Mobile",40000,List.of("8GB","128GB","Blue")));
    }
    public List<Product> getAllProducts() {
        return productsList;
    }

    public Product getProductById(int id) {
        return productsList.stream().filter(product -> product.getProductId()==id).findFirst().orElse(null);
    }

    public List<Product> getProductsByCategory(String category) {
        return productsList.stream().filter(product -> product.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public void addNewProduct(Product product) {
        productsList.add(product);
    }
}
