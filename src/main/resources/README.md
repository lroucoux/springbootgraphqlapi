Ref : https://boottechnologies-ci.medium.com/spring-boot-graphql-api-77b21fcce363

## Accéder à la console H2

http://localhost:8080/h2-console puis entrer les informations de connexion du fichier application.yaml

## Lancer des requetes graphQL

http://localhost:8080/graphiql?path=/graphql

### Liste des requetes 
#### Ajouter un auteur

```graphql
mutation{
  addAuthor(authorInput: {
    firstname: "Ludo",
    lastname: "ROUCOUX"
  }) {
    id,
    lastname,
    firstname
  }
}
```

#### Ajouter un livre

```graphql
mutation {
  addBook(
    bookInput: {title: "graphql book", isbn: "12345678", description: "book description", page: 50, price: 500, authorId: 1}
  ) {
    id
    title
    author {
      id
      lastname
      firstname
    }
  }
}
```

#### Lister les livres

```graphql
{
    getBooks {
        id
        title
        page
        price
        description
        author {
            id
            lastname
            firstname
        }
    }
}
```

#### Récupérer un livre

```graphql
{
    getBook(id: 2) {
        id
        title
        page
        price
        description
        author {
            id
            lastname
            firstname
        }
    }
}
```

#### Récupérer un auteur

```graphql
{
    getAuthor(id: 1) {
        id
        lastname
        firstname
        books {
            id,
            title,
            page,
            price,
            description
        }
    }
}
```