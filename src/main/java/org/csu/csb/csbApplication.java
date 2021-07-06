package org.csu.csb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class csbApplication {
    public static void main(String[] args) {
        SpringApplication.run(csbApplication.class, args);

    }

}
