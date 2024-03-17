package ru.netology.hibernatetask2.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatetask2.entity.Customers;
import ru.netology.hibernatetask2.repository.DbRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class DbController {

    private final DbRepository dbRepository;

    @GetMapping("/products/fetch-product")
    public List<Customers> getProductName(@RequestParam String name) {
        return dbRepository.getProductName(name);
    }
}
