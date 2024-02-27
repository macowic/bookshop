package com.example.bookproj.controller;

import com.example.bookproj.model.Shop;
import com.example.bookproj.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @GetMapping("/{id}")
    public Shop getShop(@PathVariable int id) {
        return shopService.getShop(id);
    }

    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @PutMapping
    public Shop updateShop(@RequestBody Shop shop) {
        return shopService.updateShop(shop);
    }

    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable int id) {
        shopService.deleteShop(id);
    }
}
