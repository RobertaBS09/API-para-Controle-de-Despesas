# API-para-Controle-de-Despesas
API REST para controle de despesas pessoais, desenvolvida com Spring Boot e MySQL. Permite cadastrar, consultar, atualizar e excluir despesas, gerenciando informações como categoria, valor e forma de pagamento.
# 💰 Controlador de Despesas Pessoais API

API RESTful para gestão eficiente de despesas pessoais, desenvolvida com Spring Boot.

---

## 📝 Descrição do Projeto

Este projeto consiste em uma API RESTful para o controle de despesas pessoais, desenvolvida como um exercício prático e parte do meu portfólio de desenvolvimento. A aplicação permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) sobre registros de despesas, gerenciando informações detalhadas como:

* **Nome e Descrição:** Para identificar e detalhar cada gasto.
* **Valor:** Montante da despesa.
* **Forma de Pagamento:** Enumeração para tipos de pagamento (e.g., BOLETO, CRÉDITO, PIX, DINHEIRO).
* **Dia Fixo:** Campo para indicar datas de vencimento ou recorrência (e.g., "quintoDiaUtil").
* **Categoria:** Classificação da despesa (e.g., EDUCAÇÃO, ALIMENTAÇÃO).
* **Status de Pagamento:** Indicação se a despesa já foi paga.

O objetivo principal deste projeto é demonstrar minhas habilidades em desenvolvimento backend, utilizando as melhores práticas e ferramentas do ecossistema Spring Boot.

## 🛠 Tecnologias Utilizadas

As principais tecnologias e ferramentas empregadas neste projeto incluem:

* **Java 21:** Linguagem de programação moderna.
* **Spring Boot 3.4.x:** Framework robusto para construção de APIs REST.
* **Spring Data JPA:** Simplifica a camada de persistência de dados.
* **Hibernate:** Implementação de ORM para mapeamento objeto-relacional.
* **MySQL:** Sistema de Gerenciamento de Banco de Dados Relacional.
* **Flyway:** Ferramenta para controle de versão e migração do esquema do banco de dados.
* **Maven:** Gerenciamento de dependências e build.
* **Lombok:** Para reduzir código boilerplate em entidades.
* **Validação (Jakarta Bean Validation):** Para garantir a integridade dos dados de entrada.

## 🚀 Estrutura e Funcionalidades Chave

* **Entidades JPA:** Mapeamento de objetos Java (`Despesa`) para tabelas no banco de dados.
* **Spring Data Repositories:** Interfaces para operações de acesso a dados prontas para uso.
* **Controladores REST:** Endpoints para interação com a API (`POST`, `GET`, `PUT`, `DELETE`).
* **Validação de Dados:** Utilização de anotações para validar a entrada de dados.
* **Migrações de Banco de Dados:** Gerenciamento do esquema do banco de dados via Flyway.

---
