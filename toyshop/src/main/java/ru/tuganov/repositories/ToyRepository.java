package ru.tuganov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.entities.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Integer> {
}
