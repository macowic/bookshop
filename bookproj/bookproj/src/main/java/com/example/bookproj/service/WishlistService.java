package com.example.bookproj.service;

import com.example.bookproj.model.Book;
import com.example.bookproj.model.User;
import com.example.bookproj.model.Wishlist;
import com.example.bookproj.repository.BookRepository;
import com.example.bookproj.repository.UserRepository;
import com.example.bookproj.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private WishlistRepository wishlistRepository;

    public void addToWishlist(int userId, int bookId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));

        Wishlist wishlist = new Wishlist();
        wishlist.setUser(user);
        wishlist.setBook(book);
        wishlistRepository.save(wishlist);
    }

    public List<Wishlist> getAllWishlists() {
        return (List<Wishlist>) wishlistRepository.findAll();
    }
}

