package com.example.spring5webapp02.controllers;

import com.example.spring5webapp02.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());

        // Tells Spring mvc to associate this with a View called "books"
        // if we put the books.html file in a folder we have to say "folder/books" and so on
        return "books";
    }
}
