# Web Services com Spring Boot e JPA / Hibernate

Este projeto é parte de um curso completo de Java, com o objetivo de criar uma aplicação web utilizando Spring Boot, JPA (Java Persistence API) e Hibernate. O projeto inclui a
implementação de CRUD para usuários, pedidos, produtos e outras entidades, além de tratamento de exceções e persistência de dados em banco de dados H2 e PostgreSQL.

## Objetivos do Projeto

- Criar um projeto Spring Boot utilizando Java 17
- Implementar o modelo de domínio
- Estruturar as camadas lógicas (Resource, Service, Repository)
- Configurar um banco de dados de teste (H2)
- Povoar o banco de dados com dados iniciais
- Implementar operações CRUD (Create, Retrieve, Update, Delete)
- Gerenciar exceções de forma adequada
- Deploy da aplicação no Heroku com PostgreSQL

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database** (perfil de teste)
- **PostgreSQL** (perfil de produção)
- **Maven** para gerenciamento de dependências
- **Heroku** para deploy em produção

## Instalação e Configuração

### Pré-requisitos

- Java 17
- Maven
- PostgreSQL (para o ambiente de produção)
- Heroku CLI (opcional para deploy)

### Configuração do Banco de Dados (H2 - Teste)

O projeto está configurado para usar o banco de dados H2 em ambiente de teste. Para acessar o console do H2, use a seguinte URL após iniciar a aplicação:

http://localhost:8080/h2-console

## Estrutura do Projeto

- **Modelo de Domínio**: Inclui entidades como `User`, `Order`, `Product`, `Category`, com suas devidas associações (um-para-muitos, muitos-para-muitos).
- **Camadas Lógicas**: O projeto está estruturado em três camadas principais:
  - **Resource**: Controladores REST que expõem os endpoints da API.
  - **Service**: Regras de negócios e lógica de serviço.
  - **Repository**: Interface com o banco de dados utilizando Spring Data JPA.

## Funcionalidades

- CRUD completo para as entidades `User`, `Order`, `Product`, `Category`.
- Associação muitos-para-muitos entre `Product` e `Category`.
- Gerenciamento de pedidos (`Order`) com itens (`OrderItem`).
- Tratamento de exceções personalizadas.
- Deploy automatizado no Heroku com PostgreSQL.

## Exemplos de Requisições

### Criar Usuário

POST /users
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}

### Atualizar Usuário
PUT /users/{id}
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755"
}
## Deletar Usuário
DELETE /users/{id}

