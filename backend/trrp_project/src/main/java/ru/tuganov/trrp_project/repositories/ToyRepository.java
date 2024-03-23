package ru.tuganov.trrp_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.trrp_project.entities.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Integer> {
}
