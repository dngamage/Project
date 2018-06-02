package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = { "com/service", "com/web" })
@SpringBootApplication
public class ServiceApplication
{

	public static void main( String[] args )
	{
		SpringApplication.run( ServiceApplication.class, args );
	}

}