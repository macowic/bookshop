package com.example.bookproj.service;

import com.example.bookproj.model.Shop;
import com.example.bookproj.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Shop createShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop getShop(int id) {
        return shopRepository.findById(id).orElse(null);
    }

    public List<Shop> getAllShops() {
        return (List<Shop>) shopRepository.findAll();
    }

    public Shop updateShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public void deleteShop(int id) {
        shopRepository.deleteById(id);
    }
}

