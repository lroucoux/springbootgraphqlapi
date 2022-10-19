package fr.ippon.springbootgraphqlapi.controller;

import fr.ippon.springbootgraphqlapi.entities.Author;
import fr.ippon.springbootgraphqlapi.entities.Book;

public class EntityMapper {
    public static Book toBookEntity(BookInput bookInput){
        Book book = new Book();
        book.setPage(bookInput.page());
        book.setPrice(bookInput.price());
        book.setTitle(bookInput.title());
        book.setIsbn(bookInput.isbn());
        book.setDescription(bookInput.description());
        return book;
    }

    public static Author toAuthorEntity(AuthorInput authorInput){
        Author author = new Author();
        author.setFirstname(authorInput.firstname());
        author.setLastname(authorInput.lastname());
        return author;
    }


}

record AuthorInput(String lastname,String firstname){}
record BookInput(String title,String description,String isbn, Double price, Integer page, Long authorId){}
