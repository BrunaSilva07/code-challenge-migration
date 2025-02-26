package com.example.dummyjson.controller;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * Controlador REST para gerenciar produtos.
 * Expondo endpoints para buscar todos os produtos e um produto específico por ID.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Obtém todos os produtos.
     *
     * @return Uma lista de todos os produtos disponíveis
     */
    @GetMapping
    public Flux<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     * Obtém um produto específico por ID.
     *
     * @param id O ID do produto a ser buscado
     * @return O produto encontrado
     */
    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}