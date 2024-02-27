package com.example.bookproj.controller;

import com.example.bookproj.model.Wishlist;
import com.example.bookproj.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping
    public void addToWishlist(@RequestParam int userId, @RequestParam int bookId) {
        wishlistService.addToWishlist(userId, bookId);
    }

    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }
}

