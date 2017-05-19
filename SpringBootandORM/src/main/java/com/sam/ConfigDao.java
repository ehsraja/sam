package com.sam;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class ConfigDao {
	
	@PersistenceContext   
	public EntityManager em;

	    public void setEntityManager(EntityManager entityManager) {
	        this.em = entityManager;
	    }

	    public EntityManager getEntityManager() {
	        return em;
	    }
	    
	    public void persist(Config config) {
			em.persist(config);
		}

		public List<Config> findAll() {
			return em.createQuery("SELECT * FROM Config").getResultList();
		}
	    
	    

}
