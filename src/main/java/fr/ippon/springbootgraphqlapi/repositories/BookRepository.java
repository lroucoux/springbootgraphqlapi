package fr.ippon.springbootgraphqlapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ippon.springbootgraphqlapi.entities.Author;
import fr.ippon.springbootgraphqlapi.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
