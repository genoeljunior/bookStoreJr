package com.example.bookmaneger.repository;

import com.example.bookmaneger.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book, Long> {
}
