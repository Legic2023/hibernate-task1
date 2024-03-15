package ru.netology.hibernatetask2;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateTask2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HibernateTask2Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }
}
