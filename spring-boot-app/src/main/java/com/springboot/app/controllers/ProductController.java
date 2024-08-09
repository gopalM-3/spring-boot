package com.springboot.app.controllers;

import com.springboot.app.models.Product;
import com.springboot.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService prodService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return prodService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return prodService.getProductById(prodId);
    }

    @PostMapping("/addProducts")
    public void addProducts(@RequestBody List<Product> prods) {
        prodService.addProducts(prods);
    }

    @PutMapping("/updateProducts")
    public void updateProduct(@RequestBody List<Product> prods) {
        prodService.updateProds(prods);
    }

    @DeleteMapping("/deleteProduct/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        prodService.deleteProduct(prodId);
    }

}
