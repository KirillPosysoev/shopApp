package com.example.shopapp.service;

import com.example.shopapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> findAllProduct ();
    Product saveProduct (Product product);
    Product findProduct (Integer id);
    Product updateProduct (Product product);
    void deleteProduct (Integer id);
}
