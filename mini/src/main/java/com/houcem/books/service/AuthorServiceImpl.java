

package com.houcem.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houcem.books.entities.Author;
import com.houcem.books.repos.AuthorRepository;



@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List <Author> findAll() {
        return authorRepository.findAll();
    }

	@Override
	public Author saveAuthor(Author a) {
		return authorRepository.save(a);
	}

	@Override
	public Author updateAuthor(Author a) {
		return authorRepository.save(a);
	}

	@Override
	public void deleteAuthor(Author a) {
		authorRepository.delete(a);
	}

	@Override
	public void deleteAuthorById(Long idAuth) {
		authorRepository.deleteById(idAuth);
	}

	@Override
	public Author getAuthor(Long idAuth) {
		return authorRepository.findById(idAuth).get();
	}

   
}