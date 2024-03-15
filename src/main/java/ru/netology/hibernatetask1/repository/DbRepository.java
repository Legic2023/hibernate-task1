package ru.netology.hibernatetask1.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Persons;

import java.util.List;

@Repository
public class DbRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {

        return entityManager.createNativeQuery(
                        "select * from sql_basic.persons where city_of_living = :city", Persons.class)
                .setParameter("city", city).getResultList();
    }
}
