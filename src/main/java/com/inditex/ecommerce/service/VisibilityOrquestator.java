package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.Product;
import com.inditex.ecommerce.model.Size;
import com.inditex.ecommerce.model.Stock;
import com.inditex.ecommerce.repository.ProductsRepository;
import com.inditex.ecommerce.repository.SizesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class VisibilityOrquestator {

    private List<Product> products;
    private List<Size> sizes;
    private Map<Integer, Stock> stocks;

    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private SizesRepository sizesRepository;
    @Autowired
    private LoadStocks loadStocks;
    @Autowired
    private CheckStockages checkStockages;


    public List<Integer> getVisibilityProducts() {
        log.warn( "START LOAD DATA" );
        loadData();
        log.warn( "END LOAD DATA" );
        orderProducts();
        return checkStockages.checkStocks( products, sizes, stocks);
    }

    private void loadData() {
        try {
            products = productsRepository.findAll();
            sizes = sizesRepository.findAll();
            stocks = loadStocks.getStocks();
        } catch (RuntimeException e) {
            log.error( e.getMessage() );
        }
    }

    private void orderProducts() {
        if (products!=null) {
            products.sort( Comparator.comparing( Product::getSequence ) );
        }
    }

}
