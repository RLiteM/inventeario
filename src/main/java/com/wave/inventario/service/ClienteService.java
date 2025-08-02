package com.wave.inventario.service;

import com.wave.inventario.entities.Clientes;
import com.wave.inventario.repositories.ClientesRepository;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClientesRepository clientesRepository;

public Clientes saveClientes(Clientes client) {
    client.setFechaRegistro(OffsetDateTime.now()); // si deseas asignarlo automáticamente
    return clientesRepository.save(client);
}

}
