package net.hookten.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringbootTransactionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransactionDemoApplication.class, args);
    }

}
