package org.repo.author.scauthorservice.Service;

import org.repo.author.scauthorservice.Model.Book;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class CachedDataService {
    Map<String,List<Book>> bookMap ;
    String[] desc = new String[]{"fireman", "knight","willingness","misleading gift","maven"};


    @PostConstruct
    public void init(){
        bookMap = new HashMap<>();
        bookMap.put("rob",getBookListForAuthor());
        bookMap.put("van",getBookListForAuthor());
        bookMap.put("dan",getBookListForAuthor());
    }

    private List<Book> getBookListForAuthor() {
        List<Book> bookList =  new ArrayList<>();
        bookList.add(new Book(desc[ThreadLocalRandom.current().nextInt(0,5)],"description"));
        bookList.add(new Book(desc[ThreadLocalRandom.current().nextInt(0,5)],"description"));
        bookList.add(new Book(desc[ThreadLocalRandom.current().nextInt(0,5)],"description"));
        return bookList;
    }

    public List<Book> getAllBooks(String name){
        return bookMap.get(name);
    }


}
