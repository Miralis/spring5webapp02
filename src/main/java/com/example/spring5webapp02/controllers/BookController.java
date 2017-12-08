package com.example.spring5webapp02.controllers;

import com.example.spring5webapp02.repositories.BookRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRespository bookRespository;

    public BookController(BookRespository bookRespository) {
        this.bookRespository = bookRespository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRespository.findAll());

        // Tells Spring mvc to associate this with a View called "books"
        return "books";
    }
}
