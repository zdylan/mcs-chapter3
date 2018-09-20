package com.thoughtmechanix.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
@RefreshScope
public class EagleEyeLicensingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EagleEyeLicensingServiceApplication.class, args);
    }
}
