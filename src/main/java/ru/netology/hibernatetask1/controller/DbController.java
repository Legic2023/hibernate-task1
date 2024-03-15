package ru.netology.hibernatetask1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatetask1.entity.Persons;
import ru.netology.hibernatetask1.repository.DbRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class DbController {

    private final DbRepository dbRepository;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return dbRepository.getPersonsByCity(city);
    }
}
