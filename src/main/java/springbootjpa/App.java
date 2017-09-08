/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootjpa;

import java.util.Random;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author sihai
 */
@SpringBootApplication
public class App {
    public static void main(String[] argv){
        SpringApplication.run(App.class, argv);
    }
    Random random = new Random();
    
    @Bean
    public CommandLineRunner run(AdminRepository repo){
        return (argv)->{
            Admin admin = new Admin();
            admin.setUsername("username "+random.nextInt());
            repo.save(admin);
            
            repo.findAll().forEach(a->System.out.println(a.getUsername()));
        };
    }
}
