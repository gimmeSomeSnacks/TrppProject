package ru.tuganov.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tuganov.entities.Order;
import ru.tuganov.entities.User;
import ru.tuganov.services.OrderService;
import ru.tuganov.services.BookService;
import ru.tuganov.services.UserService;

@Controller
@AllArgsConstructor
@RequestMapping("/admin")
@Slf4j
public class AdminController {
    private UserService userService;
    private OrderService orderService;

    @GetMapping("")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "admin";
    }

    @GetMapping("{id}")
    public String getUser(@PathVariable("id") Long userId, Model model) {
        model.addAttribute("user", userService.findUserById(userId));
        model.addAttribute("orders", orderService.getOrdersByUserId(userId));
        return "userInformation";
    }

    @GetMapping("ban")
    public String setBan(@RequestParam("userId") Long userId) {
        User user = userService.findUserById(userId);
        user.setAccountNonLocked(false);
        userService.save(user);
        return "redirect:/admin";
    }

    @GetMapping("unban")
    public String setUnban(@RequestParam("userId") Long userId) {
        User user = userService.findUserById(userId);
        user.setAccountNonLocked(true);
        userService.save(user);
        return "redirect:/admin";
    }
}

