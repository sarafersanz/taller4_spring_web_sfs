package com.nttdata.desafio3.nuevo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.desafio3.nuevo.entity.Cliente;
import com.nttdata.desafio3.nuevo.service.ClienteService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	ClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clienteService.crearDatosDummy();
		clienteService.mostrarTodos();
		
		List<Cliente> clientes = clienteService.buscarNombreApellido("Antonio", "Garcia Rosales");
		logger.debug(clientes.get(0).toString());
	}

}
