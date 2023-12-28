package org.ensaj.client;

import org.ensaj.client.entities.Client;
import org.ensaj.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient

public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"),"MAROUB Nour-eddine",Float.parseFloat("30")));
            clientRepository.save(new Client(Long.parseLong("2"),"ALAOUI Zaki",Float.parseFloat("30")));
            clientRepository.save(new Client(Long.parseLong("3"),"IBRAHIMI Imad",Float.parseFloat("30")));


        };
    }
}
