package com.houcem.books.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houcem.books.entities.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> {

}