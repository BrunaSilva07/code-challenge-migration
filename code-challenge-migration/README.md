
# DummyJSON Client - Java 8 e Spring Boot 2.x.x

## Descrição do Projeto

Este projeto é um microsserviço Java que interage com a API pública [DummyJSON](https://dummyjson.com/docs/products) para realizar operações de busca de produtos. O projeto foi desenvolvido usando Java 8 e Spring Boot 2.6.x.

## Objetivo do Desafio

O desafio consiste em migrar este projeto para Java 17 e Spring Boot 3.2.5. Durante a migração, você enfrentará várias dificuldades, incluindo a adaptação ao novo namespace, substituição de métodos depreciados e ajustes em testes unitários.

## Funcionalidades

- **Consulta de Produtos**: Realiza chamadas para a API do DummyJSON para buscar informações sobre produtos.
- **Integração com `WebClient`**: Utiliza `WebClient` para realizar chamadas HTTP.
- **Validação de Dados**: Validação de dados de entrada usando Bean Validation (`javax.validation`).
- **Gestão de Dependências**: Configurado para utilizar @Autowired.
- **Testes Unitários**: Inclui testes unitários desenvolvidos com JUnit 4 e Mockito.

## Estrutura do Projeto

```bash
dummyjson-client
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.dummyjsonclient
│   │   │       ├── DummyJsonClientApplication.java
│   │   │       ├── config
│   │   │       │   └── WebClientConfi.java
│   │   │       ├── controller
│   │   │       │   └── ProductController.java
│   │   │       ├── dto
│   │   │       │   └── Product.java
│   │   │       ├── service
│   │   │       │   └── ProductService.java
│   │   └── resources
│   │       ├── application.yaml
│   │       ├── application-dev.yaml
│   │       └── logback-spring.xml
│   └── test
│       ├── java
│       │   └── com.example.dummyjsonclient
│       │       ├── config
│       │       │   └── WebClientConfigTest.java
│       │       └── controller
│       │       │   └── ProductControllerTest.java
│       │       ├── dto
│       │       │   └── ProductTest.java
│       │       └── service
│       │           └── ProductServiceTest.java
│       └── resources
└── pom.xml
```

## Passos para Executar o Projeto

### Pré-requisitos

- **Java 17**
- **Maven 3.2.5**

### Executar a Aplicação

1. Clone o repositório:

    ```bash
    git clone https://github.com/WendellTufano/code-challenge-migration.git
    cd dummyjson-client
    ```

2. Compile e execute o projeto:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
## Requisitos para rodar o projeto

1. Variável de ambiente spring.profiles.active={dev,prod}

3. Acesse o serviço:

    O serviço estará disponível em `http://localhost:8080`.
    Link do Swagger 'http://localhost:8080/swagger-ui/index.html'.

   Link do health 'http://localhost:8080/actuator/health'

### Executar Testes

Para executar os testes unitários:

```bash
mvn clean test
```