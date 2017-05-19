package com.sam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class ConfigService {
	
	@Autowired
	private ConfigDao configDao ;

	@Transactional
	public void add( Config config) {
		configDao.persist(config);
	}

}
