package com.example.purduepartpicker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.Controllers", "com.CPU", "com.Brand", "com.Personal_PC", "com.GPU", "com.Motherboard" , "com.PSU", "com.RAM", "com.Storage"})
@EnableJpaRepositories("com")
@EntityScan(basePackages = { "com.CPU", "com.GPU", "com.Motherboard", "com.Personal_PC", "com.PSU", "com.RAM", "com.Storage", "com.Brand"})
public class PurduePartPickerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurduePartPickerApplication.class, args);
    }
}
