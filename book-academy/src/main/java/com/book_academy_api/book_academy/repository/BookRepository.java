package com.book_academy_api.book_academy.repository;

import com.book_academy_api.book_academy.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Long> {
}
