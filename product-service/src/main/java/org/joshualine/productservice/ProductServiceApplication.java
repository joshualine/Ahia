package org.joshualine.productservice;

import org.joshualine.productservice.product.Product;
import org.joshualine.productservice.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ProductRepository productRepository){
//		return (args -> {
//			var product = Product.builder()
//					.name("Iphone 12000")
//					.price(234)
//					.productImage("htmlkjjjjd")
//					.build();
//			productRepository.save(product);
//		});
//	}
}
