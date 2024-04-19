package ru.tuganov.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "toy_id")
    private Toy toy;
    private int amount;
    @ManyToOne
    private Order order;
}
