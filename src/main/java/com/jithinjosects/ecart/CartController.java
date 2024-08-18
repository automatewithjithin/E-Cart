package com.jithinjosects.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    CartService service;

    @GetMapping({"/", "home"})
    public List<Product> HomePage() {
        return service.getALlProducts();

    }
    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable("id") int id){
        return service.getProductById(id);
    }
    @GetMapping("/category")
    public List<Product>getProductsByCategory(@RequestParam("name") String category){
        return service.getProductsByCategory(category);
    }
}
