package com.example.demoforfactory;

import com.example.demoforfactory.model.Item;
import com.example.demoforfactory.service.ItemService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DemoforfactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoforfactoryApplication.class, args);
	}

	

}
