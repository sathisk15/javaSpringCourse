package com.sk.store;

//import com.sk.store.exercise2.User;
//import com.sk.store.exercise2.UserService;
import com.sk.store.entities.Addresses;
import com.sk.store.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		var user = User.builder().name("John").password("Pass").email("john@gmail.com").build();
		var address = Addresses.builder()
				.state("State")
				.city("City")
				.street("Street")
				.zip("zip")
				.build();

		user.addAddress(address);
		System.out.println(user);
	}

}
