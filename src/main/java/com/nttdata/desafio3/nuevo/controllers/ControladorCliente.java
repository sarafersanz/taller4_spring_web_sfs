package com.nttdata.desafio3.nuevo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.desafio3.nuevo.service.ClienteService;


// Controlador principal

@Controller

public class ControladorCliente {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/clientes")
	public String mostrarClientes(Model model1AndView) {
		final List<com.nttdata.desafio3.nuevo.entity.Cliente> listaClientes = clienteService.buscarTodos();
		model1AndView.addAttribute("clientes",listaClientes);
		return "clientes";
	}

}
