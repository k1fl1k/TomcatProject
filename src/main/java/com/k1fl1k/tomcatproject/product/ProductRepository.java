package com.k1fl1k.tomcatproject.product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        // Ініціалізація продуктів
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(i, "Product " + i, Math.round((Math.random() * 100) * 100.0) / 100.0));
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }
}