package com.example.demo.controller;

import com.example.demo.model.Supplier;
import com.example.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class SupplierController {
    @Autowired
    private SupplierRepository supplierRepository;

    @GetMapping("/suppliers")
    public @ResponseBody Iterable<Supplier> getAllUsers() {
        return supplierRepository.findAll();
    }

    @GetMapping("/suppliers/{id}")
    public @ResponseBody Optional<Supplier> getSupplierById(@PathVariable Long id) {
        return supplierRepository.findById(id);
    }
}
