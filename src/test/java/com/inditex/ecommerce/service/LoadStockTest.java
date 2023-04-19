package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.Stock;
import com.inditex.ecommerce.repository.StocksRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith( MockitoExtension.class )
public class LoadStockTest {
    private static final Integer SIZE_ID= 17;
    @InjectMocks
    private LoadStocks loadStocks;

    @Mock
    private StocksRepository stocksRepository;
    @Test
    void whenLoadStock_thenCorrect()  {
        when( stocksRepository.findAll() ).thenReturn( Arrays.asList( new Stock( SIZE_ID,0 )) );
        HashMap<Integer, Stock> stock = loadStocks.getStocks();

        assertNotNull( stock );
        assertEquals(SIZE_ID, stock.get( SIZE_ID ).getSizeId() );
    }
}