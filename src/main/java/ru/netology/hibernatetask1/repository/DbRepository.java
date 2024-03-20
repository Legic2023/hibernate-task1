package ru.netology.hibernatetask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Persons;
import ru.netology.hibernatetask1.entity.PersonsId;

import java.util.List;
import java.util.Optional;

@Repository
public interface DbRepository extends JpaRepository<Persons, PersonsId> {

    @Query("select person from Persons person where person.cityOfLiving = :city")
    List<Persons> findByCity(@Param("city") String city);

    @Query("select person from Persons person where person.age < :age order by person.age")
    List<Persons> findByAge(int age);

    @Query("select person from Persons person where person.name = :name and person.surname = :surname")
    Optional<Persons> findByNameAndSurname(String name, String surname);

}
