package com.wave.inventario.controller;

import com.wave.inventario.entities.Clientes;
import com.wave.inventario.repositories.ClientesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClientesRepository clienteRepository;

    public ClienteController(ClientesRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // GET: listar todos los clientes
    @GetMapping
    public List<Clientes> getAllClientes() {
        return clienteRepository.findAll();
    }
}
