package com.arun.spring.graphql.api.datafetcher;

import com.arun.spring.graphql.api.entity.Book;
import com.arun.spring.graphql.api.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book> {

    @Autowired
    private BookRepository repository;

    @Override
    public Book get(DataFetchingEnvironment environment) {
        String bookId = environment.getArgument("id");
        return repository.findById(bookId).orElse(null);
    }

}
