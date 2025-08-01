package com.wave.inventario.repositories;

import com.wave.inventario.entities.TiposCafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposCafeRepository extends JpaRepository<TiposCafe, Long> {
}
