package ru.tuganov.trrp_project.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.tuganov.trrp_project.entities.Order;
import ru.tuganov.trrp_project.repositories.OrderRepository;
import ru.tuganov.trrp_project.repositories.ToyRepository;

@Service
@AllArgsConstructor
@Slf4j
public class OrderService {
    private ToyRepository toyRepository;
    private OrderRepository orderRepository;

    public Iterable<Order> getOrdersByUserId(long userId) {
        return orderRepository.findAllByCustomUserId(userId);
    }

    public ResponseEntity<String> saveOrder(Order order) {
        orderRepository.save(order);
        return ResponseEntity.ok("Order added!");
    }
}
