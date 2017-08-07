package com.sam.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.sam.model.Person;





@Component
public class PersonDao {
	
	@PersistenceContext   
	public EntityManager em;

	    public void setEntityManager(EntityManager entityManager) {
	        this.em = entityManager;
	    }

	    public EntityManager getEntityManager() {
	        return em;
	    }
	    
	    public void persist(Person person) {
			em.persist(person);
		}
	    
	    public Person  getByName (String name){
	    	System.out.println("going to database");
			List<Person> prodList = em.createQuery("SELECT p FROM Person p WHERE p.first_name LIKE :person")
					 .setParameter("person", name)
					 .getResultList();
			return prodList.get(0);
		}

		public List<Person> findAll() {
			return em.createQuery("SELECT * FROM Person").getResultList();
		}
	    
	    

}
