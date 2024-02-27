package com.example.bookproj.controller;

import com.example.bookproj.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/purchase")
    public String createPurchase(@RequestParam int userId, @RequestParam int bookId) {
        try {
            purchaseService.createPurchase(userId, bookId);
            return "Purchase successful";
        } catch (RuntimeException e) {
            return "Purchase failed: " + e.getMessage();
        }
    }
}

