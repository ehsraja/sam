package com.sam;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.sam.model.Person;
import com.sam.service.PersonService;

import ch.qos.logback.core.net.SyslogOutputStream;

@Configuration
@ComponentScan("com.sam")
public class BootMain {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
		PersonService service = context.getBean(PersonService.class);
        Person person = new Person ("Common","region","LN");
        service.add(person);
        System.out.println(service.getByName("Common"));
        System.out.println(service.getByName("Common"));
        System.out.println(service.getByName("Common"));
        
	}
	

}
