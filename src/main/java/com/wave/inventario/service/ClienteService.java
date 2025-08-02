package com.wave.inventario.service;

import com.wave.inventario.entities.Clientes;
import com.wave.inventario.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClientesRepository clientesRepository;

    public Clientes saveProducts(Clientes client){

        return ClientesRepository.save(client);
    }
}
