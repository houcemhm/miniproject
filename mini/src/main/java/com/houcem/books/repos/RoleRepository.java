package com.houcem.books.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.houcem.books.entities.Role;
public interface RoleRepository  extends JpaRepository<Role, Long> {

}
