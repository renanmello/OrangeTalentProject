/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author RENAN
 
@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBconfiguration {

    private String driveClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String TestDatabaseConnection() {
        System.out.println("DB connection for H2");
        System.out.println(driveClassName);
        System.out.println(url);

        return "DB COnnection to h2 e te fode";

    }

    @Profile("prod")
    @Bean
    public String ProductionDatabaseConnection() {
        System.out.println("DB connection for H2");
        System.out.println(driveClassName);
        System.out.println(url);

        return "DB COnnection to mysql e te fode";

    }
}
*/