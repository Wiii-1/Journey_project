package com.backend.practice.Config;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.backend.practice.Repository.StudentRepository;
import com.backend.practice.Student.Student;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student nigga = new Student(
				"nigga", 
				"nigga@gmail.com",
				LocalDate.of(2000,Month.DECEMBER, 2),
				20
			);
            Student wii  = new Student( 
				"wii", 
				"wiigga@gmail.com",
				LocalDate.of(2001,Month.JUNE, 11),
				20
			);

            studentRepository.saveAll(
                List.of(nigga, wii)
            ); 
        };
    }
}
