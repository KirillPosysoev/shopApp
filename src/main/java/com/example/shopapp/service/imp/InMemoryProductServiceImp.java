package com.example.shopapp.service.imp;

import com.example.shopapp.model.Product;
import com.example.shopapp.repository.InMemoryProductDAO;
import com.example.shopapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryProductServiceImp implements ProductService {

    private final InMemoryProductDAO repository;

    @Override
    public List<Product> findAllProduct() {

        return repository.findAllProduct();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.saveProduct(product);
    }

    @Override
    public Product findProduct(Integer id) {
        return repository.findProductById(id);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.updateProduct(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteProduct(id);
    }

}
