package ru.tuganov.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.tuganov.entities.Toy;
import ru.tuganov.repositories.ToyRepository;

@Service
@AllArgsConstructor
@Slf4j
public class ToyService {
    private ToyRepository toyRepository;

    public Iterable<Toy> findAll() {
        return toyRepository.findAll();
    }
}
