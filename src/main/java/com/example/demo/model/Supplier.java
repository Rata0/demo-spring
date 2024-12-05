package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Supplier {
    private int id;
    private String type;
    private String name;
    private String director;
    private String phone;
    private String rating;

    public Supplier(int id, String type, String name, String director, String phone, String rating) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.director = director;
        this.phone = phone;
        this.rating = rating;
    }
}
