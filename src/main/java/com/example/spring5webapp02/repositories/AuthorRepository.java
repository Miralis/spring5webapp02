package com.example.spring5webapp02.repositories;

import com.example.spring5webapp02.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
