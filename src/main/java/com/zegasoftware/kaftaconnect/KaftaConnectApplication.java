package com.zegasoftware.kaftaconnect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@Slf4j
@EnableJpaAuditing
public class KaftaConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaftaConnectApplication.class, args);
	}

}
