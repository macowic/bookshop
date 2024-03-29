package com.example.bookproj.model;

import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
    private String genre;
    private String publisher;
    private int year;
    private String description;
    private int price;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;


    public Book() {

    }
    public Book(int id, String title, String author, String genre, String publisher, int year, int price, Shop shop) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
        this.shop = shop;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public Shop getShop() {
        return shop;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", publisher=" + publisher + ", year=" + year + ", shop=" + shop + '}';
    }

}
