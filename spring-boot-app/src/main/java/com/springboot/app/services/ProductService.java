package com.springboot.app.services;

import com.springboot.app.models.Product;
import com.springboot.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProducts(List<Product> prods) {
        repo.saveAll(prods);
    }

    public void updateProds(List<Product> prods) {
        repo.saveAll(prods);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
