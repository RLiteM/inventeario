package com.wave.inventario.repositories;

import com.wave.inventario.entities.DetallesPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesPedidoRepository extends JpaRepository<DetallesPedido, Long> {
}
