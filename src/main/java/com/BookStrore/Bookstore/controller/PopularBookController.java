package com.BookStrore.Bookstore.controller;

import com.BookStrore.Bookstore.entity.PopularBook;
import com.BookStrore.Bookstore.service.PopularBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books/")
public class PopularBookController {
    @Autowired
    PopularBookService popularBookService;

    @GetMapping("/popularBook")
    public List<PopularBook> getAllPopularBooks() {
        return popularBookService.retrieveAllPopularBook();
    }

    @GetMapping("/popularBook/{id}")
    public PopularBook getPopularBook(@PathVariable Integer id) {
        return popularBookService.retrievePopularBook(id).orElse(new PopularBook());
    }

    @PostMapping("/addPopularBook")
    public PopularBook addPopularBook(@RequestBody PopularBook popularBook) {
        return popularBookService.addPopularBook(popularBook);
    }

    @DeleteMapping("/removePopularBook/{id}")
    public void removePopularBook(@PathVariable Integer id) {
        popularBookService.removePopularBook(id);
    }
}
