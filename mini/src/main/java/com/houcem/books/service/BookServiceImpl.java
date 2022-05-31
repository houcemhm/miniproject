package com.houcem.books.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.houcem.books.entities.Author;
import com.houcem.books.entities.Book;
import com.houcem.books.repos.AuthorRepository;
import com.houcem.books.repos.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	@Autowired
	AuthorRepository authorRepository;

	@Override
	public Book saveBook(Book b) {
		return bookRepository.save(b);
	}

	@Override
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}

	@Override
	public void deleteBook(Book b) {
		bookRepository.delete(b);
	}

	@Override
	public void deleteBooktById(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Page<Book> getAllBookParPage(int page, int size) {
		return bookRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Book> findByTitleBook(String title) {
		return bookRepository.findByTitleBook(title);
	}


/*
	@Override
	public List<Book> findByTitlePrice(String title, Double price) {

		return bookRepository.findByTitlePrice(title, price);
	}

	@Override
	public List<Book> findByAuthor(Author author) {
		return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> findByAuthorIdAuth(Long id) {
		return bookRepository.findByAuthorIdAuth(id);
	}

	@Override
	public List<Book> findByOrderByBookTitleAsc() {
		return bookRepository.findByOrderByBookTitleAsc();
	}

	@Override
	public List<Book> trierBookTitlePrice() {
		return bookRepository.trierBookTitlePrix();
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll() ;
	}*/

	@Override
	public List<Book> findByBookTitleContains(String title) {
		return bookRepository.findByTitleBook(title);
	}

	@Override
	public List<Book> findByAuthor(Author author) {
		return bookRepository.findByAuthor(author);
	}


}