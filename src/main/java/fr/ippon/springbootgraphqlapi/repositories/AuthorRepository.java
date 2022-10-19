package fr.ippon.springbootgraphqlapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ippon.springbootgraphqlapi.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
