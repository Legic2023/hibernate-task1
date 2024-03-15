package ru.netology.hibernatetask1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateTask1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HibernateTask1Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }
}
