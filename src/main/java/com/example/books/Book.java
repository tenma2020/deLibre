package com.example.books;

import java.util.Date;

public class Book {

    String id;
    String title;
    String[] author;
    String publisher;
    String isbn;
    String rack;
    String typeBook;
    Date datePublished;
    Date dateRegistered;
    Date dateLastBorrowed;
    Date dateLastReturned;

    public Book(String id, String title, String[] author, String publisher, String isbn, String rack, Date datePublished, Date dateRegistered, Date dateLastBorrowed, Date dateLastReturned, String typeBook) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.rack = rack;
        this.typeBook = typeBook;
    }

    

    public void setAuthor(String[] author) {
        this.author = author;
    }
    public void setDateLastBorrowed(Date dateLastBorrowed) {
        this.dateLastBorrowed = dateLastBorrowed;
    }
    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setRack(String rack) {
        this.rack = rack;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }
    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    public void setDateLastReturned(Date dateLastReturned) {
        this.dateLastReturned = dateLastReturned;
    }
    public String[] getAuthor() {
        return author;
    }
    public Date getDateLastBorrowed() {
        return dateLastBorrowed;
    }
    public Date getDatePublished() {
        return datePublished;
    }
    public String getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getRack() {
        return rack;
    }
    public String getTitle() {
        return title;
    }
    public String getTypeBook() {
        return typeBook;
    }
    public Date getDateRegistered() {
        return dateRegistered;
    }
    public Date getDateLastReturned() {
        return dateLastReturned;
    }

    

    
}
