package com.springrabbit.springrabbitconsumer;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages="com.springrabbit")
public class SpringrabbitconsumerApplication {
	@Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringrabbitconsumerApplication.class, args);
	}

}
