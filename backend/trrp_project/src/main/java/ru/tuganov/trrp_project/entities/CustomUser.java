package ru.tuganov.trrp_project.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class CustomUser {
    @Id
    private String username;
    private String password;
    private boolean enabled;
}