package com.everis.agendadigital;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class AgendaDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaDigitalApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResover(){
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
}
