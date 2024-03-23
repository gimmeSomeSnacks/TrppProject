package ru.tuganov.trrp_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.trrp_project.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    Iterable<Order> findAllByUserId(long userId);
}
