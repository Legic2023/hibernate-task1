package ru.netology.hibernatetask1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatetask1.entity.Persons;
import ru.netology.hibernatetask1.repository.DbRepository;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class DbController {

    private final DbRepository dbRepository;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return dbRepository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> getPersonsByAge(@RequestParam int age) {
        return dbRepository.findByAgeLessThanOrderByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Optional<Persons> getPersonsByNameSurname(@RequestParam String name, @RequestParam String surname) {
        return dbRepository.findByNameAndSurname(name, surname);
    }

}
