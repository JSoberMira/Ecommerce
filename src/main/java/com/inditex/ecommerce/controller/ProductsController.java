package com.inditex.ecommerce.controller;

import com.inditex.ecommerce.service.VisibilityOrquestator;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    private VisibilityOrquestator visibilityOrquestator;
    @GetMapping( value= "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponse( responseCode = "200", description = "List of product id to show")
    List< Integer > getProducts() {
        return visibilityOrquestator.getVisibilityProducts();
    }
}
