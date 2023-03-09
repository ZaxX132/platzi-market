package com.zaxx.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clientes")
//
//         id character varying(20) COLLATE pg_catalog."default" NOT NULL,
//         nombre character varying(40) COLLATE pg_catalog."default",
//         apellidos character varying(100) COLLATE pg_catalog."default",
//         celular numeric,
//         direccion character varying(80) COLLATE pg_catalog."default",
//         correo_electronico character varying(70) COLLATE pg_catalog."default",
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Integer celular;
    private String direccion;
    @Column(name="correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
