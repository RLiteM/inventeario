package com.wave.inventario.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;

/**
 * Esta entidad representa la tabla 'pedidos' de la base de datos.
 * Contiene la información de la cabecera de un pedido.
 */
@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // --- Relación con Clientes ---
    // Muchos pedidos pueden pertenecer a Un cliente.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clientes cliente;

    @CreationTimestamp
    @Column(name = "fecha_pedido", nullable = false, updatable = false)
    private OffsetDateTime fechaPedido;


    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, columnDefinition = "estado_pedido")
    private EstadoPedido estado;

    @Column(name = "total_pedido", precision = 10, scale = 2)
    private BigDecimal totalPedido;

    @OneToMany(
        mappedBy = "pedido",
        cascade = CascadeType.ALL, 
        orphanRemoval = true, 
        fetch = FetchType.LAZY
    )
    private List<DetallesPedido> detalles = new ArrayList<>();


    // Constructor por defecto requerido por JPA
    public Pedidos() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public OffsetDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(OffsetDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public List<DetallesPedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesPedido> detalles) {
        this.detalles = detalles;
    }
}
