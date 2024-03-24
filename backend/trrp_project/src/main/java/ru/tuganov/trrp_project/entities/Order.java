package ru.tuganov.trrp_project.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ElementCollection
    private Map<Integer, Integer> toys;
    private String state;
    private int totalCost;
    private long customUserId;
}
