package ru.netology.hibernatetask2.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String  surname;

    @Column
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

}
