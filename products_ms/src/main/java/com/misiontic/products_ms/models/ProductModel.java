package com.misiontic.products_ms.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class ProductModel {
    @Id
    private String nombre;
    private String descripcion;
    private Integer cantidad;
    private float talla;
    private String tipo;
    private Date fechaCreacion;

    ProductModel(String nombre,String descripcion,Integer cantidad,float talla,String tipo,Date fechaCreacion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.talla = talla;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return Integer return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return float return the talla
     */
    public float getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(float talla) {
        this.talla = talla;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return Date return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}