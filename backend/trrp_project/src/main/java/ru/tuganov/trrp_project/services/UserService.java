package ru.tuganov.trrp_project.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.tuganov.trrp_project.entities.User;
import ru.tuganov.trrp_project.repositories.UserRepository;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {
    private UserRepository userRepository;

    public ResponseEntity<String> addNewUser(User user) {
        if (userRepository.existsByLogin(user.getLogin())) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add order!");
        } else {
            return ResponseEntity.ok("User added!");
        }
    }

    public ResponseEntity<String> loginUser(User user) {
        if (userRepository.existsByLogin(user.getLogin())) {
            return ResponseEntity.ok("User is logged in!");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to login!");
        }
    }
}
