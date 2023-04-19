package com.inditex.ecommerce.repository;


import com.inditex.ecommerce.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stock, Integer> {
}
