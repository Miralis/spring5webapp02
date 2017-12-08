package com.example.spring5webapp02.repositories;

import com.example.spring5webapp02.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
