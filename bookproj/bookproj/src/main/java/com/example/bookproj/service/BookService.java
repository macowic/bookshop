package com.example.bookproj.service;

import com.example.bookproj.model.Book;
import com.example.bookproj.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBook(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}

