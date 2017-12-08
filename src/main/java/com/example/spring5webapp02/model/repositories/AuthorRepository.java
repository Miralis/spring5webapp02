package com.example.spring5webapp02.model.repositories;

import com.example.spring5webapp02.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
