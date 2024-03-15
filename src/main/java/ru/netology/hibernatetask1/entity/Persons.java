package ru.netology.hibernatetask1.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Persons {
    @Id
    private String name;

    @Id
    private String surname;

    @Column
    private String phone_number;

    @Column
    private String city_of_living;

    @Id
    private int age;

}
