package com.gl.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gl.boot.database.CustomerDB;
import com.gl.boot.entity.Book;
import com.gl.boot.entity.Customer;
import com.gl.boot.service.BookService;
import com.gl.boot.service.CustomerService;
// auto configuration
// componenst scanning
// spring boot initializstion
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Ready");
//		CustomerDB customerDB = context.getBean(CustomerDB.class);
//		System.out.println(customerDB.getTemplate());
//		System.out.println(customerDB.getCustomerCount());
		
		CustomerService customerService = context.getBean(CustomerService.class);
//		System.out.println(customerService.getCustomerCount());
//		
//		System.out.println(customerService.getCustomerById("mohit@gmail.com"));
//		
//		for(Customer c : customerService.getAllCustomers())
//			System.out.println(c);
		
//		Customer c = new Customer();
//		c.setEmail("akash@gmail.com");
//		c.setCity("Delhi");
//		c.setCustname("Akash");
//		c.setPassword("ak");
//		c.setPhone("8765678765");
		
//		System.out.println(customerService.insertCustomer(c));
//		
//		System.out.println(customerService.insertCustomer(c));
//		System.out.println();
//		for(Customer c1 : customerService.getAllCustomersByCity("Nagpur"))
//			System.out.println(c1);
		
		System.out.println();
		for(Customer c1 : customerService.getAllCustomersByNameLike("A%"))
			System.out.println(c1);
		
		System.out.println();
		for(Customer c1 : customerService.getAllCustomersByCityAndName("Noida","A%"))
			System.out.println(c1);
		
//		BookService bookService = context.getBean(BookService.class);
//		for(Book book : bookService.getBooksByAuthorId(1))
//			System.out.println(book);
		
	}

}
