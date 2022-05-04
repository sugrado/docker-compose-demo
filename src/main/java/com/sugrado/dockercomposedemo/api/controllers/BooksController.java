package com.sugrado.dockercomposedemo.api.controllers;

import com.sugrado.dockercomposedemo.business.BookService;
import com.sugrado.dockercomposedemo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BooksController {
    private BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.status(200).body(this.bookService.getAll());
    }

    @PostMapping()
    public ResponseEntity<Book> add(@RequestBody Book book) {
        return ResponseEntity.status(201).body(this.bookService.add(book));
    }

    @DeleteMapping()
    public ResponseEntity<Boolean> delete(@RequestBody Book book) {
        return ResponseEntity.ok(this.bookService.delete(book));
    }
}
