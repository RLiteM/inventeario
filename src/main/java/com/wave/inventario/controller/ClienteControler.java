package com.wave.inventario.controller;

import com.wave.inventario.entities.Clientes;
import com.wave.inventario.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes") // se recomienda incluir la '/' inicial
public class ClienteController { // <-- CORREGIDO: nombre con doble 'l'
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Clientes saveClientes(@RequestBody Clientes cliente) {
        return clienteService.saveClientes(cliente); // <-- debe coincidir con método del servicio
    }
}
