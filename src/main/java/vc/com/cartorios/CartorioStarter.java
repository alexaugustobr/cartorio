package vc.com.cartorios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ CartorioConfig.class })
public class CartorioStarter {

	public static void main(String[] args) {
		SpringApplication.run(CartorioStarter.class, args);
	}
}
