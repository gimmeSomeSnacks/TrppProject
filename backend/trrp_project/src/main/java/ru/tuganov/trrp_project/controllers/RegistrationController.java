package ru.tuganov.trrp_project.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.tuganov.trrp_project.entities.CustomUser;


import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j

// Добавить это
@RequestMapping("/register")

// Название поменяй на EntryController
public class RegistrationController {

    private UserDetailsManager userDetailsManager;
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register") // Это поменять на 
    @GetMapping // Это

    public String showRegistrationForm(Model model) {
        model.addAttribute("customUser", new CustomUser());
        return "registration-form";
    }

//    @PostMapping("/register")
//    public String registerUser(@ModelAttribute("customUser") CustomUser user) {
//        if (userDetailsManager.userExists(user.getName())) {
//            log.info("!!!! ERRRROOOOORRR !!!!");
//        }
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        userDetailsManager.createUser(new User(user.getName(), encodedPassword, List.of(new SimpleGrantedAuthority("SIMPLE_USER"))));
//        return "redirect:/login";
//    }
    @PostMapping("/register") // Это поменять на 
    @PostMapping // Это
    
    public String registerUser(@ModelAttribute("customUser") CustomUser user) {
//        if (userDetailsManager.userExists(user.getName())) {
//            log.info("User with username {} already exists.", user.getName());
//        }
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        UserDetails userDetails = User.withUsername(user.getUsername())
                .password(encodedPassword)
                .roles("SIMPLE_USER")
                .build();
        userDetailsManager.createUser(userDetails);
        return "redirect:/login";
    }
}