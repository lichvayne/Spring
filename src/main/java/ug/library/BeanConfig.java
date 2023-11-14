package ug.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ug.library"})
public class BeanConfig {

    @Bean
    public Book book(){
        return new Book();
    }

    @Bean
    public Library library(){
        return new Library();
    }
}
