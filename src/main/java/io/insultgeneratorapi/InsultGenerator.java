package io.insultgeneratorapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InsultGenerator {

    public static void main(String... args) {
        new SpringApplicationBuilder(InsultGenerator.class)
                .run(args);
    }
}
