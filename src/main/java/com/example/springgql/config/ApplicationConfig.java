package com.example.springgql.config;

import com.example.springgql.model.Address;
import com.example.springgql.model.User;
import com.example.springgql.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CommandLineRunner init(UserRepository userRepository) {

        User user = User.builder().firstName("Leeladurga Prasad").lastName("Gunti")
                .primaryAddress(
                        Address.builder()
                                .address1("add1")
                                .address2("add2")
                                .address3("add3")
                                .city("Hyderabad")
                                .zipCode(5000000)
                                .state("Telangana")
                                .build())
                .secondaryAddress(
                        Address.builder()
                                .address1("second add1")
                                .address2("second add2")
                                .address3("second add3")
                                .city("Hyderabad")
                                .zipCode(5000000)
                                .state("Telangana")
                                .build())
                .build();
        return args -> userRepository.save(user);
    }
}
