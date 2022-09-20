package com.example.ej5.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class PerfilProduction implements Perfil, CommandLineRunner {

    @Value("${environment}")
    String environment;

    @Value("${bd.url}")
    String bd_url;

    @Override
    public String getData() {
        return "Environment: " + environment + " / bd.url: " + bd_url;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Environment: " + environment + " / bd.url: " + bd_url);
    }
}
