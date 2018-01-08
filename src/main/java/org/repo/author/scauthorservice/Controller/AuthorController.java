package org.repo.author.scauthorservice.Controller;

import org.repo.author.scauthorservice.Model.Book;
import org.repo.author.scauthorservice.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(value="/getBooks/{name}")
    public List<Book> getBooksforAuthor(@PathVariable String name){
        return authorService.getBooks(name);
    }


}
