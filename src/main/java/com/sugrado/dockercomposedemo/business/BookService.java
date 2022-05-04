package com.sugrado.dockercomposedemo.business;

import com.sugrado.dockercomposedemo.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book add(Book book);

    boolean delete(Book book);
}
