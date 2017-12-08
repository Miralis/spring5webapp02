package com.example.spring5webapp02.repositories;

import com.example.spring5webapp02.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
