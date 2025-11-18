package com.lakshay.SpringAop;

import com.lakshay.SpringAop.Service.ArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private ArrayService arrayService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        log.info("Max value is {}", arrayService.getMax());
        //arrayService.getException();
    }
}
