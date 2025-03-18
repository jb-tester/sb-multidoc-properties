package com.mytests.spring.sbmultidocproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * *
 * <p>Created by irina on 13.11.2020.</p>
 * <p>Project: sb-multidoc-properties</p>
 * *
 */
@SpringBootApplication
//@ConfigurationPropertiesScan
@EnableConfigurationProperties({MyConfigProps.class})
public class SbMultidocPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbMultidocPropertiesApplication.class, args);
    }

    @Bean  @Profile("first")
    public MyService firstService() {
        return new MyServiceFirst();
    }

    @Bean  @Profile("second")
    public MyService secondService() {
        return new MyServiceSecond();
    }
    @Bean  @Profile("third")
    public MyService thirdService() {
        return new MyServiceThird();
    }
}
