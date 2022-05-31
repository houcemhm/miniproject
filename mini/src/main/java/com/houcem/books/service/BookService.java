package com.houcem.books.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.houcem.books.entities.Author;
import com.houcem.books.entities.Book;

public interface BookService {
	Book saveBook(Book p);

	Book updateBook(Book p);

	void deleteBook(Book p);

	void deleteBooktById(Long id);

	Book getBook(Long id);

	List<Book> getAllBooks();

	Page<Book> getAllBookParPage(int page, int size);

	List<Book> findByTitleBook(String title);

	List<Book> findByAuthor(Author author);

	List<Book> findByBookTitleContains(String title);
	/*
	 * List<Book> findByTitlePrice(String Title, Double prix);
	 * 
	 * 
	 * 
	 * List<Book> findByAuthorIdAuth(Long id);
	 * 
	 * List<Book> findByOrderByBookTitleAsc();
	 * 
	 * List<Book> trierBookTitlePrice();
	 * 
	 * 
	 * List<Author> getAllAuthors();
	 * 
	 * 
	 */

}
