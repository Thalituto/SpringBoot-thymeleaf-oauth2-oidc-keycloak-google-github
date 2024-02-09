package com.example.customerfrontthymeleafap;

import com.example.customerfrontthymeleafap.entities.Customer;
import com.example.customerfrontthymeleafap.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafApApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafApApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("thali").email("thali@gmail.com").build());
            customerRepository.save(Customer.builder().name("neph").email("neph@gmail.com").build());
            customerRepository.save(Customer.builder().name("man").email("man@gmail.com").build());
            customerRepository.save(Customer.builder().name("tuto").email("tuto@gmail.com").build());
        };
    }
}
