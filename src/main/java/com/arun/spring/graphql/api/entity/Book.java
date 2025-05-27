package com.arun.spring.graphql.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
@Entity
public class Book {

    @Id
    private String bookId;
    private String bookName;
    private String publishedDate;
    private String[] writer;
    private String publisher;

}
