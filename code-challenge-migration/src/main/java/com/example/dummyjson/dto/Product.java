package com.example.dummyjson.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * Classe que representa um produto.
 * Contém as propriedades básicas de um produto como ID, título, descrição e preço.
 */
public class Product {

    @NotNull
    @Min(0L)
    @Max(999L)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private Double price;

    // Getters and Setters

    /**
     * Obtém o ID do produto.
     *
     * @return O ID do produto
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o ID do produto.
     *
     * @param id O ID do produto
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o título do produto.
     *
     * @return O título do produto
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o título do produto.
     *
     * @param title O título do produto
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define a descrição do produto.
     *
     * @param description A descrição do produto
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Define o preço do produto.
     *
     * @param price O preço do produto
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}