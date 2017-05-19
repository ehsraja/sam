package com.sam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sam")
@EnableAutoConfiguration
public class BootwithOrm {
	
	  public static void main(String[] args) {
	       // SpringApplication.run(BootwithOrm.class, args);
		  ConfigurableApplicationContext ctx = SpringApplication.run(BootwithOrm.class, args);
	    //    EventHolderBean bean = ctx.getBean(EventHolderBean.class);
	      System.out.println("Hello");  
		//  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	      ConfigService dao = ctx.getBean(ConfigService.class);
	        Config conf = new Config ("Common","region","LN");
	        dao.add(conf);
	    }

}
