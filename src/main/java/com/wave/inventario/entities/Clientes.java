package com.wave.inventario.entities;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 @Entity
 @Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre_completo", nullable = false, length = 255)
    private String nombreCompleto;
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Column(name = "direccion_envio", nullable = false, columnDefinition = "TEXT")
    private String direccionEnvio;
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private OffsetDateTime fechaRegistro;

    // Default constructor
    public Clientes() {}
    // Parameterized constructor
    public Clientes(Integer id, String nombreCompleto, String email, String direccionEnvio, OffsetDateTime fechaRegistro) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.direccionEnvio = direccionEnvio;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters and Setters
    public Integer getId() {        
        return id;
    }   
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccionEnvio() {
        return direccionEnvio;
    }
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    public OffsetDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(OffsetDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;}


}
