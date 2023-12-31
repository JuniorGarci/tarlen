package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelos.Clientes;



public interface ClientesService {

	
	public Clientes guardarCliente(Clientes cliente);
	
	public Optional<Clientes> buscarPorId(String id);

	List<Clientes> obtenerClientes();
    
    void eliminarCliente(String id);
	
}
