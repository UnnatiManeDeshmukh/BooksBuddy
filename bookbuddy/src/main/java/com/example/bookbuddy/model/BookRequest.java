package com.example.bookbuddy.model;

import jakarta.persistence.*;

@Entity
@Table(name="book_request")
public class BookRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String status;


    private String userName;
    private String email;
    private String bookTitle;
    private String author;

    private String status1 = "PENDING"; // default

    // Constructors
    public BookRequest() {}

    public BookRequest(String userName, String email, String bookTitle, String author) {
        this.userName = userName;
        this.email = email;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBookTitle() { return bookTitle; }
    public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
