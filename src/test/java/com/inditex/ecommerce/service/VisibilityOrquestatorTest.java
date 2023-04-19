package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.Product;
import com.inditex.ecommerce.model.Size;
import com.inditex.ecommerce.model.Stock;
import com.inditex.ecommerce.repository.ProductsRepository;
import com.inditex.ecommerce.repository.SizesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith( MockitoExtension.class  )
class VisibilityOrquestatorTest {
    private static final List<Integer> MESSAGE_PRODUCTS= Arrays.asList( 3, 2, 1);

    @InjectMocks
    private VisibilityOrquestator visibilityOrquestatorService;

    @Mock
    private ProductsRepository productsRepository;
    @Mock
    private SizesRepository sizesRepository;
    @Mock
    private LoadStocks loadStocks;

    @Mock
    private CheckStockages checkStockages;

    @Test
    void whenGetVisibilityProducts_getAIntegerList() {
        List <Product> products = mockProductList();
        List <Size> sizes = mockSizeList();
        HashMap<Integer, Stock> stocks = mockStockHash();

        when( productsRepository.findAll() ).thenReturn( products );
        when( sizesRepository.findAll() ).thenReturn( sizes );
        when( loadStocks.getStocks( )).thenReturn( stocks );
        when( checkStockages.checkStocks( products, sizes, stocks )).thenReturn( MESSAGE_PRODUCTS );

        List<Integer> result = visibilityOrquestatorService.getVisibilityProducts();

        assertEquals( MESSAGE_PRODUCTS, result);
    }

    @Test
    void whenGetVisibilityProducts_getAError() {
        when( productsRepository.findAll() ).thenThrow( RuntimeException.class );

        List<Integer> result = visibilityOrquestatorService.getVisibilityProducts();

        assertEquals( 0, result.size());
    }

    private List<Size> mockSizeList() {
        Size size = new Size(1,1, false, false);
        return Arrays.asList( size );
    }

    private HashMap<Integer, Stock> mockStockHash() {
        HashMap<Integer, Stock> o = null;
        return o;
    }

    private List<Product> mockProductList() {
        Product product_1 = new Product(1,16);
        Product product_2 = new Product(2,12);
        Product product_3 = new Product(3,6);
        return Arrays.asList( product_1, product_2 , product_3 );
    }

}
