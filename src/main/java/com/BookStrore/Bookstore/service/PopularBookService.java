package com.BookStrore.Bookstore.service;

import com.BookStrore.Bookstore.entity.PopularBook;
import com.BookStrore.Bookstore.repository.PopularBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PopularBookService {
    @Autowired
    PopularBookRepository popularBookRepository;

    public List<PopularBook> retrieveAllPopularBook() {
        return popularBookRepository.findAll();
    }

    public Optional<PopularBook> retrievePopularBook(Integer id) {
        return popularBookRepository.findById(id);
    }

    public PopularBook addPopularBook(PopularBook popularBook) {
        return popularBookRepository.save(popularBook);
    }

    public void removePopularBook(Integer id) {
        popularBookRepository.deleteById(id);
    }
}
