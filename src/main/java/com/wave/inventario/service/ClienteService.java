package com.wave.inventario.service;

import com.wave.inventario.entities.Clientes;
import com.wave.inventario.repositories.ClientesRepository;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClientesRepository clientesRepository;

    public Clientes saveClientes(Clientes client) {
        client.setFechaRegistro(OffsetDateTime.now());
        return clientesRepository.save(client);
    }


    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

}
