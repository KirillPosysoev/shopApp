package com.example.shopapp.controller;

import com.example.shopapp.model.Product;
import com.example.shopapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {


    private ProductService service;

    @GetMapping("/all")
    public List<Product> findAllProduct() {
        return service.findAllProduct();

    }

    @PostMapping("save_product")
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Integer id) {
        return service.findProduct(id);
    }

    @PostMapping("update_product")
    public Product updateProduct(Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("delete_product/{id}")
    public void deleteProduct(@PathVariable Integer id) {

    }
}
