package com.zaxx.market.persistence.entity;
//        (
//        id_categoria integer NOT NULL DEFAULT 'nextval('categorias_id_categoria_seq'::regclass)',
//        descripcion character varying(45) COLLATE pg_catalog."default" NOT NULL,
//        estado boolean NOT NULL,


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;

    private String descripcion;
    private Boolean estado;


    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
