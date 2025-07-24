# 💸 API para Controle de Despesas

Este é um projeto pessoal criado com o objetivo de praticar o desenvolvimento de APIs REST utilizando **Java** e **Spring Boot**. A aplicação simula um sistema de controle de despesas, permitindo o cadastro, consulta, atualização e exclusão de registros financeiros.

> ⚠️ Os dados utilizados são **fictícios**, com o único propósito de testar e demonstrar as funcionalidades da aplicação.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman/Insomnia (para testes de requisições)

---

## 📦 Funcionalidades

- [x] Cadastro de despesas
- [x] Consulta de todas as despesas
- [x] Atualização de despesas existentes
- [x] Desativação de despesas
- [x] Ativação de Despesas

---

## ⚙️ Como Rodar o Projeto Localmente

### Pré-requisitos

- Java 17+
- MySQL instalado e rodando
- Maven
- IDE (recomendada: IntelliJ IDEA)

### 1. Clone o repositório

```bash
git clone https://github.com/RobertaBS09/API-para-Controle-de-Despesas.git
cd API-para-Controle-de-Despesas
```

### 2. Configure o banco de dados

Crie um banco de dados MySQL com o nome `despesas`.

Crie um arquivo `application.properties` dentro de `src/main/resources/` com as suas credenciais locais. ⚠️ **Não inclua esse arquivo no Git!**

Ou copie o modelo abaixo para `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/despesas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> Exemplo genérico disponível em `application-example.properties`.

### 3. Execute o projeto

Via terminal:

```bash
./mvnw spring-boot:run
```

A API ficará disponível em:

```
http://localhost:8080
```


## 👩‍💻 Sobre

Projeto desenvolvido por **Roberta Barbosa da Silva** durante seus estudos em Spring Boot e back-end Java.

📎 [Meu LinkedIn](www.linkedin.com/in/roberta-barbosa-da-silva-)

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.
