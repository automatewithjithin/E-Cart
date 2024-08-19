package com.jithinjosects.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    CartService service;

    @GetMapping({"/", "home"})
    public ResponseEntity<List<Product>> HomePage() {
        return service.getALlProducts();

    }
    @GetMapping("product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id){
        return service.getProductById(id);
    }
    @GetMapping("/category")
    public ResponseEntity<List<Product>>getProductsByCategory(@RequestParam("name") String category){
        return service.getProductsByCategory(category);
    }
    @PostMapping("/add")
    public ResponseEntity<String>addProduct(@RequestBody Product product){
        return service.addNewProduct(product);
    }
    @PutMapping("/update")
    public String updateProduct(@RequestBody Product product){
        return service.updateProduct(product);

    }
}
