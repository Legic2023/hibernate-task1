package ru.netology.hibernatetask2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class OrderTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Date date;

    @ManyToOne
    private Customers customers;

    @Column(name = "product_name")
    private String productName;

    @Column
    private int amount;

}
