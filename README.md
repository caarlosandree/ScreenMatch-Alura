# ScreenMatch

Aplicação Spring Boot para busca de filmes e séries utilizando a API do OMDB. Projeto da carreira Java com Spring Boot da Alura.

## Funcionalidades

- Busca de filmes por título
- Busca de séries por título
- Exibição de detalhes (ano, gênero, diretor, elenco, plot, rating)
- Integração com API OMDB

## Stack Tecnológico

- **Java**: 25
- **Spring Boot**: 4.0.6
- **Build Tool**: Gradle
- **API**: OMDB API
- **Testes**: JUnit 5

## Pré-requisitos

- Java 25+
- Chave da API OMDB ([obtenha aqui](http://www.omdbapi.com/apikey.aspx))

## Como Começar

### 1. Clone o repositório

```bash
git clone <url-do-repositorio>
cd alura
```

### 2. Configure a chave da API

Edite `src/main/resources/application.properties`:

```properties
spring.application.name=alura
omdb.api.key=SUA_CHAVE_AQUI
```

### 3. Execute a aplicação

```bash
./gradlew bootRun
```

### 4. Execute os testes

```bash
./gradlew test
```

## Estrutura do Projeto

```
alura/
├── src/main/java/br/com/api/alura/
│   ├── AluraApplication.java    # Classe principal
│   ├── model/                    # DTOs (Serie, Filme)
│   ├── service/                  # ConsumoApi
│   └── principal/                # Principal.java
├── src/main/resources/
│   └── application.properties
└── build.gradle
```

## Arquitetura

**Fluxo**: Principal → ConsumoApi → OMDB API → JSON → Modelos → Console

**Componentes**:
- `AluraApplication`: Ponto de entrada Spring Boot
- `ConsumoApi`: Requisições HTTP à OMDB
- `Modelos`: DTOs para mapeamento JSON
- `Principal`: Execução principal

## API OMDB

**Endpoint base**: `http://www.omdbapi.com/`

**Parâmetros**:
- `apikey`: Sua chave de API
- `t`: Título do filme/série
- `type`: movie ou series
- `y`: Ano (opcional)

**Exemplo de requisição**:
```
http://www.omdbapi.com/?apikey=SUA_CHAVE&t=Breaking+Bad&type=series
```

## Desenvolvimento

### Adicionar novas dependências

Edite `build.gradle` na seção `dependencies`.

### Criar novos modelos

Adicione classes em `src/main/java/br/com/api/alura/model/`.

### Criar novos serviços

Adicione classes em `src/main/java/br/com/api/alura/service/`.

## Licença

Este projeto é parte do curso da Alura.
