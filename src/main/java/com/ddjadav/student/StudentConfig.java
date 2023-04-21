package com.ddjadav.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student alex = new Student(
                "Alex",
                "alex.st@mail.com",
                LocalDate.of(1985, MAY,30));
            Student arya = new Student(
                    "Arya",
                    "arya.st@mail.com",
                    LocalDate.of(2002, JANUARY,9));
            repository.saveAll(List.of(alex,arya));
        };
    }
}
