package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="Book")
public class BookEntity {

    @Id
    private String bookId;
    private String bookName;
    private int price;
    private int noOfPages;
    @ManyToMany(mappedBy = "books")
    private List<AuthorEntity> authors;

    public BookEntity() {
    }

    public BookEntity(String bookId, String bookName, int price, int noOfPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.noOfPages = noOfPages;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }
}
