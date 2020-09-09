package com.sujata.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Author")
public class AuthorEntity {
    @Id
    private String authorId;
    private String authorName;
    @ManyToMany
    private List<BookEntity> books;
    //Composition
    @Embedded
    private Address address;

    public AuthorEntity() {
    }

    public AuthorEntity(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
