package com.houcem.books.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBook;
	@NotNull
	@Size(min = 4, max = 50)
	private String titleBook;
	
	@NotNull
	@Min(value = 10)
	@Max(value = 10000)
	private Double priceBook;
	
	@Min(value = 1900)
	@Max(value = 2022)
    private int year;
	
	private String description;
	
    @ManyToOne
	private Author author;
 
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", titleBook=" + titleBook + ", priceBook=" + priceBook + ", year=" + year
				+ ", description=" + description + ", author=" + author + "]";
	}

	public Book(Long idBook, @NotNull @Size(min = 4, max = 15) String titleBook,
			@NotNull @Min(10) @Max(10000) Double priceBook, @Min(1900) @Max(2022) int year, String description,
			Author author) {
		super();
		this.idBook = idBook;
		this.titleBook = titleBook;
		this.priceBook = priceBook;
		this.year = year;
		this.description = description;
		this.author = author;
	}

	public Long getIdBook() {
		return idBook;
	}

	public void setIdBook(Long idBook) {
		this.idBook = idBook;
	}

	public String getTitleBook() {
		return titleBook;
	}

	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}

	public Double getPriceBook() {
		return priceBook;
	}

	public void setPriceBook(Double priceBook) {
		this.priceBook = priceBook;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}