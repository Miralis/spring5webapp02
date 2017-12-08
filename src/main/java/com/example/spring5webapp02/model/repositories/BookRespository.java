package com.example.spring5webapp02.model.repositories;

import com.example.spring5webapp02.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespository extends CrudRepository<Book, Long> {

}
