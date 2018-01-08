package org.repo.author.scauthorservice.Service;

import org.repo.author.scauthorservice.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private BookService bookService;

    public List<Book> getBooks(String name) {
        return bookService.getBooks(name);
    }
}
