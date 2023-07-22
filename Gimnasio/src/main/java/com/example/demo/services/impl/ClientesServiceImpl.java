package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.Clientes;
import com.example.demo.repositories.ClientesRepository;
import com.example.demo.services.ClientesService;


@Service
public class ClientesServiceImpl implements ClientesService{

	@Autowired
	private ClientesRepository clienteRepository;
	
	@Override
	public Clientes guardarCliente(Clientes cliente) {
		clienteRepository.save(cliente);
		return null;
	}

	@Override
	public Optional<Clientes> buscarPorId(String id) {
		Optional<Clientes> cliente = clienteRepository.findById(id);
		return cliente;
	}
 
	@Override
    public List<Clientes> obtenerClientes() {
         return (List<Clientes>)clienteRepository.findAll();
    }

    @Override
    public void eliminarCliente(String id) {
       clienteRepository.deleteById(id);
    }

}
