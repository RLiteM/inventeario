package com.wave.inventario.controller;

import com.wave.inventario.entities.Clientes;
import com.wave.inventario.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Clientes saveClientes(@RequestBody Clientes cliente) {
        return clienteService.saveClientes(cliente);
    }

    @GetMapping
    public List<Clientes> getAllClientes() {
        return clienteService.getAllClientes();
    }

}

