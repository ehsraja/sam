package com.sam.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sam.model.Person;


@Component
public class PersonService {
	
	@Autowired
	private PersonDao personDao ;

	@Transactional
	public void add( Person person) {
		personDao.persist(person);
	}
	
	
	@Cacheable("Person")
	@Transactional
	public Person getByName(String name) {
		System.out.println("findig person");
		Person p = 	personDao.getByName(name);
		return p ;
	//	slowLookupOperation();
	//	return new Product(name,100);
	}

}
