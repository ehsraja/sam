package hu.daniel.hari.learn.spring.orm.main;

import hu.daniel.hari.learn.spring.orm.model.Product;
import hu.daniel.hari.learn.spring.orm.service.ProductService;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class SpringOrmMain {
	
	public static void main(String[] args) {
		
		//Create Spring application context
		
		System.out.println("hello");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
		ProductService productService = ctx.getBean(ProductService.class);
		
		//Do some data operation
		
		productService.add(new Product( "Bulb"));
		productService.add(new Product( "Dijone mustard"));
		
		System.out.println("listAll: " + productService.listAll());
		
		//Test transaction rollback (duplicated key)
		
		try {
			productService.addAll(Arrays.asList(new Product ("Book"), new Product("Soap"), new Product( "Computer")));
		} catch (DataAccessException dataAccessException) {
		}
		
		//Test element list after rollback
		System.out.println("listAll: " + productService.listAll());
		
		ctx.close();
		
	}
}
