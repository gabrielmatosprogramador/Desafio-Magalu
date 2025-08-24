# Desafio Magalu - Agendamento de Comunicações

Este é um projeto de API REST para o agendamento de envio de comunicações, desenvolvido como parte de um desafio. A aplicação permite agendar, consultar e cancelar o envio de mensagens por diferentes canais.

## Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.5.5**
* **Spring Data JPA**
* **Maven**
* **PostgreSQL**
* **Lombok**

## Funcionalidades

* **Agendar uma nova comunicação:** Cria um novo agendamento para o envio de uma mensagem.
* **Consultar um agendamento:** Busca um agendamento existente pelo seu ID.
* **Cancelar um agendamento:** Remove um agendamento existente.

## Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone <URL_DO_SEU_REPOSITORIO>
    ```

2.  **Configure o Banco de Dados:**
    Abra o arquivo `src/main/resources/application.properties` e adicione as seguintes propriedades para configurar a conexão com o seu banco de dados PostgreSQL:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/seu-banco
    spring.datasource.username=seu-usuario
    spring.datasource.password=sua-senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3.  **Execute a aplicação:**
    Utilize o Maven para compilar e executar o projeto:

    ```bash
    ./mvnw spring-boot:run
    ```
    A API estará disponível em `http://localhost:8080`.

## Endpoints da API

A seguir estão os endpoints disponíveis na API.

### `POST /agendamentos`

Cria um novo agendamento de comunicação.

**Exemplo de corpo da requisição:**

```json
{
  "destinatario": "exemplo@email.com",
  "mensagem": "Sua fatura de agosto já está disponível!",
  "canalComunicacao": "EMAIL",
  "status": "AGENDADO",
  "dataHoraEnvio": "2025-08-30T10:00:00"
}
