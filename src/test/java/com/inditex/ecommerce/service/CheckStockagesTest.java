package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.Product;
import com.inditex.ecommerce.model.Size;
import com.inditex.ecommerce.model.Stock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith( MockitoExtension.class  )
class CheckStockagesTest {

    private CheckStockages checkStockages = new CheckStockages();

    private static final List<Integer> MESSAGE_PRODUCTS= Arrays.asList( 5, 6, 1, 3);
    private static final List<Integer> MESSAGE_PRODUCTS_SPECIAL= Arrays.asList(8);

    @Test
    void  whenCheckStocks_getAString() {
        List <Product> products = mockProductList();
        List <Size> sizes = mockSizeList();
        HashMap<Integer, Stock> stocks = mockStockHash();

        List<Integer> result = checkStockages.checkStocks( products, sizes, stocks );
        assertEquals( MESSAGE_PRODUCTS, result );
    }

    @Test
    void  whenCheckStocksSpecial_getAString() {
        List <Product> products = new ArrayList<>();
        products.add( new Product(8,18) );

        List<Size> sizes = new ArrayList<>();
        sizes.add( new Size(73,8, false, true) );
        sizes.add( new Size(74,8, false, false) );

        HashMap<Integer, Stock> stocks = new HashMap<>();
        stocks.put(73, new Stock( 73, 1 ) );
        stocks.put(74, new Stock( 74, 1 ) );

        List<Integer> result = checkStockages.checkStocks( products, sizes, stocks );
        assertEquals( MESSAGE_PRODUCTS_SPECIAL, result );
    }


    private List<Size> mockSizeList() {
        List<Size> sizeList = new ArrayList<>();

        sizeList.add( new Size(11,1, true, false) );
        sizeList.add( new Size(12,1, false, false) );
        sizeList.add( new Size(13,1, true, false) );
        sizeList.add( new Size(21,2, false, false) );
        sizeList.add( new Size(22,2, false, false) );
        sizeList.add( new Size(23,2, true, true) );
        sizeList.add( new Size(31,3, true, false) );
        sizeList.add( new Size(32,3, false, false) );
        sizeList.add( new Size(33,3, false, false) );
        sizeList.add( new Size(41,4, false, false) );
        sizeList.add( new Size(42,4, false, false) );
        sizeList.add( new Size(43,4, false, false) );
        sizeList.add( new Size(44,4, true, true) );
        sizeList.add( new Size(51,5, true, false) );
        sizeList.add( new Size(52,5, false, false) );
        sizeList.add( new Size(53,5, false, false) );
        sizeList.add( new Size(54,5, true, true) );
        sizeList.add( new Size(61,6, false, false) );
        sizeList.add( new Size(62,6, false, true) );
        sizeList.add( new Size(71,7, false, false) );
        sizeList.add( new Size(72,7, false, false) );
        return sizeList;
    }

    private HashMap<Integer, Stock> mockStockHash() {
        HashMap<Integer, Stock> o = new HashMap<>();
        o.put( 11, new Stock( 11, 0 ) );
        o.put( 12, new Stock( 12, 0 ) );
        o.put( 13, new Stock( 13, 0 ) );
        o.put( 22, new Stock( 22, 0 ) );
        o.put( 31, new Stock( 31, 10 ) );
        o.put( 32, new Stock( 32, 10 ) );
        o.put( 33, new Stock( 33, 10 ) );
        o.put( 41, new Stock( 41, 0 ) );
        o.put( 42, new Stock( 42, 0 ) );
        o.put( 43, new Stock( 43, 0 ) );
        o.put( 44, new Stock( 44, 10 ) );
        o.put( 51, new Stock( 51, 10 ) );
        o.put( 52, new Stock( 52, 10 ) );
        o.put( 53, new Stock( 53, 10 ) );
        o.put( 54, new Stock( 54, 10 ) );
        o.put( 61, new Stock( 61, 5 ) );
        o.put( 62, new Stock( 62, 5 ) );
        o.put( 71, new Stock( 71, 0 ) );
        o.put( 72, new Stock( 72, 0 ) );
        return o;
    }

    private List<Product> mockProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add( new Product(5,6) );
        productList.add( new Product(2,7) );
        productList.add( new Product(6,9) );
        productList.add( new Product(1,10) );
        productList.add( new Product(4,13) );
        productList.add( new Product(3,15) );
        productList.add( new Product(7,17) );

        return productList;
    }
}
