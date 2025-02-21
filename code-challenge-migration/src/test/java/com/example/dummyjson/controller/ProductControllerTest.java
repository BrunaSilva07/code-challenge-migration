package com.example.dummyjson.controller;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductControllerTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        // Simulando 999 produtos
        List<Product> products = productService.getAllProducts();
        assertEquals(1, products.size());  // Verificando se retornam 999 produtos
    }

    @Test
    public void testGetProductById() {
        Product result = productService.getProductById(1L);
        assertEquals("Essence Mascara Lash Princess", result.getTitle()); // Ajuste conforme a resposta esperada
    }
}