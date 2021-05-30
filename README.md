# MarvelApi

Esse projeto é uma releitura dos endpoints de characters a [API da Marvel](https://developer.marvel.com/docs#!/public).

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 11: Necessário para executar o projeto Java](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html)
- [Plataforma: Para desenvolvimento do projeto]
- [Plugin do lombok, na plataforma escolhida](https://projectlombok.org/)
- [Postman - Para execução e validação do projeto](https://www.postman.com/downloads/)
- [Git - Para realizar o clone do projeto](https://git-scm.com/downloads)

## Desenvolvimento

Para iniciar, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/jian-kowalski/MarvelApi.git
```

### Construção

Para construir o projeto com o Maven, no diretorio raiz executar os comando abaixo:

```shell
.\mvnw clean install
```

### Execução

Para executar o projeto com o Maven, no diretorio raiz executar os comando abaixo:

```shell
java -jar target/marvel-0.0.1-SNAPSHOT.jar
```
Obs: O projeto roda na port 8080, certifique-se que a mesma esta disponivel.
### Documentação

Para ter acesso a ducumentaçao da API, após a execução do projeto acessar:

- [Documentação](http://localhost:8080/v1/public/swagger-ui.html)

### Postman

Para ter acesso a validação da API, após a execução do projeto, abrir o arquivo Marvel - Characters.postman_collection, e consumir os dados de consulta da API.
## Licença

Não se aplica.
