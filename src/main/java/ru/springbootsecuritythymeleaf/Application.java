package ru.springbootsecuritythymeleaf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.springbootsecuritythymeleaf.config.WebConfig;
import ru.springbootsecuritythymeleaf.config.security.SecurityConfig;

@SpringBootApplication
@Configuration
@Import({WebConfig.class,  SecurityConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}