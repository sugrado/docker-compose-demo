package com.sugrado.dockercomposedemo.business;

import com.sugrado.dockercomposedemo.dataAccess.BookRepository;
import com.sugrado.dockercomposedemo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book add(Book book) {
        this.bookRepository.save(book);
        return book;
    }

    @Override
    public boolean delete(Book book) {
        try {
            this.bookRepository.delete(book);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
