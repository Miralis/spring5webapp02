package com.example.spring5webapp02.bootstrap;

import com.example.spring5webapp02.model.Author;
import com.example.spring5webapp02.model.Book;
import com.example.spring5webapp02.repositories.AuthorRepository;
import com.example.spring5webapp02.repositories.BookRespository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRespository bookRespository;

    public DevBootstrap(AuthorRepository authorRepository, BookRespository bookRespository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
    }

    private void initData(){
        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRespository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Worx");
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRespository.save(noEJB);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
