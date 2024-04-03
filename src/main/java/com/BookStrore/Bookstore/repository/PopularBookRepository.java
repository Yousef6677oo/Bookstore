package com.BookStrore.Bookstore.repository;

import com.BookStrore.Bookstore.entity.PopularBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopularBookRepository extends JpaRepository<PopularBook, Integer> {
}
