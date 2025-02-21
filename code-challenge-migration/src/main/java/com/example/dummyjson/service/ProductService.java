package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

/**
 * Serviço para interagir com a API externa para buscar produtos.
 * Utiliza o WebClient para fazer requisições HTTP e retornar produtos.
 */
@Service
public class ProductService {

    private final WebClient webClient;

    /**
     * Construtor da classe ProductService.
     *
     * @param webClient O WebClient configurado para acessar a API externa
     */
    @Autowired
    public ProductService(WebClient webClient) {
        this.webClient = webClient;
    }

    /**
     * Obtém todos os produtos da API externa.
     *
     * @return Uma lista de produtos
     */
    public List<Product> getAllProducts() {
        return webClient.get()
                .uri("/products")
                .retrieve()
                .bodyToFlux(Product.class)
                .collectList()
                .block();
    }

    /**
     * Obtém um produto específico pela ID da API externa.
     *
     * @param id O ID do produto a ser buscado
     * @return O produto encontrado
     */
    public Product getProductById(Long id) {
        return webClient.get()
                .uri("/products/{id}", id)
                .retrieve()
                .bodyToMono(Product.class)
                .block();
    }
}