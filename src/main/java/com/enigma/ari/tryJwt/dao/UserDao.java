package com.enigma.ari.tryJwt.dao;

import com.enigma.ari.tryJwt.model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}