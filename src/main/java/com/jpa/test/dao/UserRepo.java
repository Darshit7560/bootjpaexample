package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	
	public List<User> findByCity(String city);
	
	public List<User> findByNameOrCity(String name,String city);
	
	@Query("select u FROM User u ")
	public List<User> getAlluser();
	
	@Query("select  u FROM User u WHERE u.name=:n and u.city=:c")
	public List<User> getUerByName(@Param("n") String name,@Param("c") String city);
	
	@Query(value="select * FROM User" ,nativeQuery=true)
	public List<User> getUsers();
    
}
