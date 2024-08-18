package com.jithinjosects.ecart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private String category;
    private int price;

}
