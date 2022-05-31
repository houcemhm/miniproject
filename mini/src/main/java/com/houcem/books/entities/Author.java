package com.houcem.books.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAuth;
	private String nameAuth;
	private String kind;
	@JsonIgnore
	@OneToMany(mappedBy = "author")
	private List<Book> books;
	public Author(Long idAuth, String nameAuth, String kind, List<Book> books) {
		super();
		this.idAuth = idAuth;
		this.nameAuth = nameAuth;
		this.kind = kind;
		this.books=books;
	}
	
	public Long getIdAuth() {
		return idAuth;
		}
		public void setIdAuth(Long idAuth) {
		this.idAuth = idAuth;
		}
		public String getNameAuth() {
		return nameAuth;
		}
		public void setNameAuth(String nameAuth) {
		this.nameAuth = nameAuth;
		}
		public String getKind() {
		return kind;
		}
		public void setKind(String kind) {
		this.kind = kind;
		}
		public List<Book> getBooks() {
		return books;
		}
		public void setBooks(List<Book> Books) {
		this.books = Books;
		}

		@Override
		public String toString() {
			return "Author [idAuth=" + idAuth + ", nameAuth=" + nameAuth + ", kind=" + kind + "]";
		}
	
	
	
}

