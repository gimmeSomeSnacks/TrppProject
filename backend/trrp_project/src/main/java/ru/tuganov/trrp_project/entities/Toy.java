package ru.tuganov.trrp_project.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "toys")
@Getter
@Setter
public class Toy {
    @Id
    private int id;
    private String name;
    private int toyPrice;
}
