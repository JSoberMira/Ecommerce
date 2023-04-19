package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.Stock;
import com.inditex.ecommerce.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class LoadStocks {

    @Autowired
    private StocksRepository stocksRepository;

    public HashMap<Integer, Stock> getStocks() {
        HashMap<Integer, Stock> stocks = new HashMap<>();
        List<Stock> stockList = stocksRepository.findAll();
        stockList.stream().forEach( stock -> stocks.put( stock.getSizeId(), stock) );
        return stocks;
    }
}
