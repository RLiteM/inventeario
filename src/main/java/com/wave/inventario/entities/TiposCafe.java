package com.wave.inventario.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipos_cafe")
public class TiposCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = true, length = 100)
    private String nombre;

    @Column(name = "origen", length = 100)
    private String origen;

    @Column(name = "notas_de_sabor", columnDefinition = "TEXT")
    private String notasDeSabor;

    // Constructor por defecto requerido por JPA
    public TiposCafe() {
    }

    // Getters y Setters (Están correctos como los tenías)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNotasDeSabor() {
        return notasDeSabor;
    }

    public void setNotasDeSabor(String notasDeSabor) {
        this.notasDeSabor = notasDeSabor;
    }
}
