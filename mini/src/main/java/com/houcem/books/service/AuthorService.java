package com.houcem.books.service;

import java.util.List;

import com.houcem.books.entities.Author;

public interface AuthorService {
	    List <Author> findAll();
	    Author saveAuthor(Author a);
	    Author updateAuthor(Author a);
	    void deleteAuthor(Author a);
	     void deleteAuthorById(Long id);
	     Author getAuthor (Long id);
}
