package com.example.shopapp.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Product {
    @NonNull
    private Integer id;
    @NonNull
    private String name;
    private String brandOfCar;
    private String modelOfCar;
    private String modelYear;
    private String manufactured;
}
