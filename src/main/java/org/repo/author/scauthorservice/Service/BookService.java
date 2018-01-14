package org.repo.author.scauthorservice.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @Autowired
    private CachedDataService dataService;


    @HystrixCommand(fallbackMethod = "getFallBackBooks")
    public List<Book> getBooks(String name) {

        ResponseEntity<List<Book>> list = restTemplate.exchange("http://book-service/dbService/rob", HttpMethod.GET
                ,  null, new ParameterizedTypeReference<List<Book>>() {
        });
        return list.getBody();
    }

    public List<Book> getFallBackBooks(String name) {
        return dataService.getAllBooks(name);
    }


}
