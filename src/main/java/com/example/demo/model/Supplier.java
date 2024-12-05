package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@Table("suppliers")
public class Supplier {
    @Id
    private Long id;
    private String type;
    private String name;
    private String director;
    private String phone;
    private String rating;

    public Supplier(String type, String name, String director, String phone, String rating) {
        this.type = type;
        this.name = name;
        this.director = director;
        this.phone = phone;
        this.rating = rating;
    }
}
