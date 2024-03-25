package ru.tuganov.trrp_project.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.tuganov.trrp_project.entities.Order;
import ru.tuganov.trrp_project.services.OrderService;

@RestController
@AllArgsConstructor
@Slf4j

// Добавить это
@RequestMapping("/order")

public class OrderController {
    private OrderService orderService;

    @PostMapping("/add-order") // Это поменять на 
    @PostMapping // Это

    public ResponseEntity<String> addOrder(@RequestBody String orderJson) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Order order = objectMapper.readValue(orderJson, Order.class);
            return orderService.saveOrder(order);
        } catch (Exception e) {
            log.error("Failed to receive order!", e);
            // Можно тупо статус отправить, убрать бади этот
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to receive order!");
        }
    }

    @GetMapping("/get-orders/{userId}") // Это поменять на 
    @GetMapping // Это
    
    public Iterable<Order> getOrders(@PathVariable(name  = "userId") long userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
