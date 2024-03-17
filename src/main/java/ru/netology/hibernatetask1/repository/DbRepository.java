package ru.netology.hibernatetask1.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Persons;

import java.util.List;

@Repository
public class DbRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {

        return entityManager.createQuery(
                        "select persons from Persons persons where cityOfLiving = :city", Persons.class)
                .setParameter("city", city)
                .getResultList();

    }
}
