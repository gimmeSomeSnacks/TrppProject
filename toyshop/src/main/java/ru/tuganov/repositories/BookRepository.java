package ru.tuganov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
