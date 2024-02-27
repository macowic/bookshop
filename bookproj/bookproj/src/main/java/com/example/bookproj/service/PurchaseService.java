package com.example.bookproj.service;

import com.example.bookproj.model.Book;
import com.example.bookproj.model.Purchase;
import com.example.bookproj.model.User;
import com.example.bookproj.repository.BookRepository;
import com.example.bookproj.repository.PurchaseRepository;
import com.example.bookproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Transactional
    public void createPurchase(int userId, int bookId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));

        if (user.getMoney() < book.getPrice()) {
            throw new RuntimeException("Insufficient balance");
        }

        user.setMoney(user.getMoney() - book.getPrice());
        userRepository.save(user);

        Purchase purchase = new Purchase();
        purchase.setUser(user);
        purchase.setBook(book);
        purchaseRepository.save(purchase);
    }
}
