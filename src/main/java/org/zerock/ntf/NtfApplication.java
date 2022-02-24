package org.zerock.ntf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NtfApplication {

    public static void main(String[] args) {
        SpringApplication.run(NtfApplication.class, args);
    }

}
