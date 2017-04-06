package com.timoxino.ppoker;

import com.timoxino.ppoker.dao.AccountRepository;
import com.timoxino.ppoker.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebAppInitializer{

    public static void main(String[] args) throws Exception{
        SpringApplication.run(WebAppInitializer.class, args);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository)
    {
        return (args) -> accountRepository.save(new Account("user@gmail.com", "userpass"));
    }
}

