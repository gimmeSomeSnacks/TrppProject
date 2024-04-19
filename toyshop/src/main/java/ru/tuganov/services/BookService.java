package ru.tuganov.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.tuganov.entities.Book;
import ru.tuganov.repositories.BookRepository;

@Service
@AllArgsConstructor
@Slf4j
public class BookService {
    private BookRepository toyRepository;

    public Iterable<Book> findAll() {
        return toyRepository.findAll();
    }
}
