package com.zaxx.market.domain.service;

import com.zaxx.market.domain.Purchase;
import com.zaxx.market.persistence.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private CompraRepository compraRepository;

    public List<Purchase> getAll(){
     return compraRepository.getAll();
    }
    public Optional<List<Purchase>> getByClient(String clientId){
        return compraRepository.getByClient(clientId);
    }
    public Purchase save(Purchase purchase){
        return compraRepository.save(purchase);
    }
}
