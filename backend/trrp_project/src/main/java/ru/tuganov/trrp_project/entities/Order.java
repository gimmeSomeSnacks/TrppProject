package ru.tuganov.trrp_project.entities;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    private int id;
    @ElementCollection
    private Map<Integer, Integer> toys;
    private String state;
    private long userId;
    private int totalCost;
}
