package com.example.spring5webapp02.bootstrap;

import com.example.spring5webapp02.model.Author;
import com.example.spring5webapp02.model.Book;
import com.example.spring5webapp02.model.Publisher;
import com.example.spring5webapp02.repositories.AuthorRepository;
import com.example.spring5webapp02.repositories.BookRespository;
import com.example.spring5webapp02.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRespository bookRespository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRespository bookRespository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){
        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher harper = new Publisher("Harper Collins", "Pivet Drive 04");
        Book ddd = new Book("Domain Driven Design", "1234", harper);
        eric.getBooks().add(ddd);

        authorRepository.save(eric);
        publisherRepository.save(harper);
        bookRespository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher worx = new Publisher("Worx", "YEEEEEEEEEEEAAAAAAAHHHH 1");
        Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        publisherRepository.save(worx);
        bookRespository.save(noEJB);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
