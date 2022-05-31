package com.houcem.books.service;

import java.util.List;

import com.houcem.books.entities.Role;

public interface RoleService {
	 List <Role> findAll();
	    
	 Role saveRole(Role r);
	 Role updateRole(Role r);
	     Role getRole (Long idRole);
}
