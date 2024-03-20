package ru.netology.hibernatetask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Persons;
import ru.netology.hibernatetask1.entity.PersonsId;

import java.util.List;
import java.util.Optional;

@Repository
public interface DbRepository extends JpaRepository<Persons, PersonsId> {
    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByAgeLessThanOrderByAge(int age);

    Optional<Persons> findByNameAndSurname(String name, String surname);

}