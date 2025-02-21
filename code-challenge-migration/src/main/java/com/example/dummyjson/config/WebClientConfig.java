package com.example.dummyjson.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Classe de configuração para configurar o WebClient com a URL da API.
 * A URL é injetada a partir do arquivo de propriedades.
 */
@Configuration
public class WebClientConfig {

    @Value("${dummyjson.api.url}")
    private String apiUrl;

    /**
     * Cria e configura um bean de WebClient com a URL base injetada.
     *
     * @param builder O construtor do WebClient fornecido pelo Spring
     * @return Uma instância de WebClient configurada
     */
    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        // Usando a URL injetada como base URL
        return builder.baseUrl(apiUrl).build();
    }
}