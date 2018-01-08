package org.repo.author.scauthorservice.Model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class AuthorDetails {
    private String name;
    private int id;
    private List<Book> bookList;
}
