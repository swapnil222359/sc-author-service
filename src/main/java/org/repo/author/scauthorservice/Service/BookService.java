package org.repo.author.scauthorservice.Service;

import org.repo.author.scauthorservice.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Book> getBooks(String name) {

        ResponseEntity<List<Book>> list = restTemplate.exchange("http://localhost:8000/dbService/rob", HttpMethod.GET
                ,  null, new ParameterizedTypeReference<List<Book>>() {
        });
        return list.getBody();
    }
}
