package com.springboot.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
@AllArgsConstructor
public class Product {

    private int prodId;
    @Setter
    private String prodName;
    @Setter
    private int prodPrice;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
