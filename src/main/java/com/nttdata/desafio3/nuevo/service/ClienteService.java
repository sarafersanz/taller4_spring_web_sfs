package com.nttdata.desafio3.nuevo.service;

import java.util.List;

import com.nttdata.desafio3.nuevo.entity.Cliente;

public interface ClienteService {
	
	void guardar(Cliente cliente);
	List<Cliente> buscarTodos();
	List<Cliente> buscarNombreApellido(String nombre, String apellido);
	void borrar(Cliente cliente);
	void crearDatosDummy();
	void mostrarTodos();
}
