package com.springboot.app.services;

import com.springboot.app.models.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "PS5", 50000),
            new Product(2, "PS6", 60000),
            new Product(3, "PS7", 70000)
    ));

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product(0, "N/A", 0));
    }

    public void addProducts(List<Product> prods) {
        products.addAll(prods);
    }

    public void updateProds(List<Product> prods) {
        prods.forEach(prod -> {
            products.stream()
                    .filter(p -> p.getProdId() == prod.getProdId())
                    .findFirst()
                    .ifPresent(p -> {
                        p.setProdName(prod.getProdName());
                        p.setProdPrice(prod.getProdPrice());
                    });
        });
    }

    public void deleteProduct(int prodId) {
        products.removeIf(p -> p.getProdId() == prodId);
    }
}
