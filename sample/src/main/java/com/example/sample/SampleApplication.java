package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SampleApplication {

	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(this.passwordEncoder.encode("supi"));
//		
//	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}

}
