package com.example.shopapp.repository;

import com.example.shopapp.model.Product;
import org.springframework.stereotype.Repository;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Repository
public class InMemoryProductDAO {
    private final List<Product> PRODUCTS = new ArrayList<>();

    public List<Product> findAllProduct() {
        return PRODUCTS;
    }

    public Product saveProduct(Product product) {
        PRODUCTS.add(product);
        return product;
    }

    public Product findProductById(Integer id) {
        return PRODUCTS.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    public Product updateProduct(Product product) {
        var productIndex = IntStream.range(0, PRODUCTS.size())
                .filter(index -> PRODUCTS.get(index).getId().equals(product.getId()))
                .findFirst()
                .orElse(-1);
        if (productIndex > -1) {
            PRODUCTS.set(productIndex, product);
            return product;
        }
        return product;
    }


    public void deleteProduct(Integer id) {
        var product = findProductById(id);
        if (product != null) {
            PRODUCTS.remove(product);
        }

    }
}
