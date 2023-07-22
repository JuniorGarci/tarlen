package com.example.Controllers;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.Clientes;
import com.example.demo.services.impl.ClientesServiceImpl;

@RestController
@RequestMapping("/gym")
public class clientesController {
    
 @Autowired
    private ClientesServiceImpl clienteserviceimpl;

    @GetMapping("/crear")
    public Clientes guardarCliente(@RequestBody Clientes cliente) throws ParseException{
        clienteserviceimpl.guardarCliente(cliente);
        return cliente;
    }

     @GetMapping("/buscar/{id}")
     public Optional<Clientes> buscarCliente(@PathVariable(name="id") String id ){
        return clienteserviceimpl.buscarPorId(id);
     } 

     @GetMapping("/obtenerclientes")
     public List<Clientes> obtenerlosClientes() {
        return clienteserviceimpl.obtenerClientes();
    }

     @DeleteMapping("/eliminarcliente/{id}")
    public void eliminar(@PathVariable (name= "id") String id) {
        clienteserviceimpl.eliminarCliente(id);
    }



}
