package com.practice.customerjpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface CustomerRepository extends CrudRepository<Customer,Long>{
	
	List<Customer> findBylastname(String lastname);
	Customer findById(long id);
	
	@Query("Select firstname from Customer where firstname like %:ch%")
	List<String> findFistnameStartingWithGivenChar(@Param("ch") char ch);

}
