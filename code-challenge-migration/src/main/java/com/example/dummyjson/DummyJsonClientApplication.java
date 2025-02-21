package com.example.dummyjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicializa a aplicação Spring Boot.
 * A anotação @SpringBootApplication marca esta classe como a classe de configuração principal
 * e o ponto de entrada para a execução da aplicação.
 */
@SpringBootApplication
public class DummyJsonClientApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     *
     * @param args Argumentos da linha de comando (se houver)
     */
    public static void main(String[] args) {
        SpringApplication.run(DummyJsonClientApplication.class, args);
    }
}