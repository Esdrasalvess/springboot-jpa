package com.easantos.springboot_jpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.ListCrudRepository;

import com.easantos.springboot_jpa.entities.Order;
import com.easantos.springboot_jpa.entities.User;
import com.easantos.springboot_jpa.entities.enums.OrderStatus;
import com.easantos.springboot_jpa.repositories.OrderRepository;
import com.easantos.springboot_jpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		//Tudo que for colocado aqui será executado quando a aplicação for iniciada 
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		Order o1 = new Order(null, Instant.parse("2024-08-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2024-08-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2024-08-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		((ListCrudRepository<User, Long>) userRepository).saveAll(Arrays.asList(u1,u2));
		((ListCrudRepository<Order, Long>) orderRepository).saveAll(Arrays.asList(o1,o2, o3));
	}
	
	
	
}
