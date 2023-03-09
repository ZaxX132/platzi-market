package com.zaxx.market.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;

//compras_productos
//        (
//        id_compra integer NOT NULL,
//        id_producto integer NOT NULL,
//        cantidad integer,
//        total numeric(16,2),
//        estado boolean,


@Entity
@Table(name="compras_productos")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
    private BigDecimal numeric;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_compra",insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name="id_producto",insertable = false,updatable = false)
    private Producto producto;


    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getNumeric() {
        return numeric;
    }

    public void setNumeric(BigDecimal numeric) {
        this.numeric = numeric;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
