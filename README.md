# 💼 Desafio Backend - Itaú Unibanco (Estudo)

Este repositório contém a minha implementação de estudo do desafio técnico proposto pelo Itaú Unibanco, com foco em desenvolvimento backend utilizando **Java** e **Spring Boot**.

> ❗️ Este projeto foi desenvolvido apenas para fins de aprendizado e prática. Não é uma submissão oficial ao desafio.

## 📌 Descrição do Desafio

A proposta consiste em desenvolver uma **API REST** capaz de:
- Receber transações com valor e data
- Armazenar os dados **em memória**
- Retornar estatísticas com base nas transações dos últimos **60 segundos**

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.4.4
- Maven
- Postman / Insomnia (testes de API)

## 🔧 Funcionalidades da API

### 📥 POST `/transacao`

Recebe uma nova transação com os seguintes campos:

```json
{
  "valor": 123.45,
  "dateHora": "2020-08-07T12:34:56.789-03:00"
}
```

**Restrições:**
- `valor` deve ser ≥ 0
- `dateHora` deve estar no passado (nunca no futuro)
- JSON deve estar bem formado

**Respostas:**
- `201 Created`: Transação válida registrada
- `422 Unprocessable Entity`: Dados inválidos
- `400 Bad Request`: JSON mal formatado

### 🧹 DELETE `/transacao`

Remove todas as transações armazenadas em memória.

**Resposta:**
- `200 OK`

### 📊 GET `/estatistica`

Retorna as estatísticas com base nas transações dos últimos **60 segundos**:

```json
{
  "count": 10,
  "sum": 1234.56,
  "avg": 123.45,
  "min": 12.34,
  "max": 234.56
}
```

**Resposta:**
- `200 OK`: Sempre retorna os 5 campos (mesmo que todos os valores sejam 0)

## 📚 Aprendizados

Esse projeto me permitiu:
- Consolidar conhecimentos em Java e Spring Boot
- Praticar a criação de APIs REST seguindo boas práticas
- Trabalhar com dados em memória de forma performática
- Aplicar testes, validações e tratamento de erros robustos


