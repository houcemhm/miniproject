package com.houcem.books.repos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.houcem.books.entities.Author;
import com.houcem.books.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	//List<Book> findByTitleBookContains(String title);
	@Query("select b from Book b where b.titleBook like %:title% ")
	List<Book> findByTitleBook(String title);
	
	@Query("select b from Book b where b.author = ?1")
	List<Book> findByAuthor(Author author);

}

