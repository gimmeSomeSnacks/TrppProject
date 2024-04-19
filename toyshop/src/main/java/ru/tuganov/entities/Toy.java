package ru.tuganov.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "toys")
@Getter
@Setter
public class Toy {
    @Id
    private int id;
    private String name;
    private String toyPrice;
    @Column(length = 1000)
    private String description;
    @OneToMany(mappedBy = "toy")
    private List<OrderItem> orderItem;
}
