package com.sugrado.dockercomposedemo.dataAccess;

import com.sugrado.dockercomposedemo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book getFirstById(int id);
}
