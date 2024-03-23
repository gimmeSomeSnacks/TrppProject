package ru.tuganov.trrp_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.trrp_project.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByLogin(String name);
}
