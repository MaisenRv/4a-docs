package com.misiontic.products_ms.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class TransactionModel {
    @Id
    private String id;
    private String usuarioOrigen;
    private String usuarioDestino;
    private String tipoTransaccion;
    private String producto;
    private Integer cantidad;
    private String total;
    private Date fecha;

    public TransactionModel(String id,String usuarioOrigen,String usuarioDestino,String tipoTransaccion,String producto,Integer cantidad,String total,Date fecha){
        this.id = id;
        this.usuarioOrigen = usuarioOrigen;
        this.usuarioDestino = usuarioDestino;
        this.tipoTransaccion = tipoTransaccion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the usuarioOrigen
     */
    public String getUsuarioOrigen() {
        return usuarioOrigen;
    }

    /**
     * @param usuarioOrigen the usuarioOrigen to set
     */
    public void setUsuarioOrigen(String usuarioOrigen) {
        this.usuarioOrigen = usuarioOrigen;
    }

    /**
     * @return String return the usuarioDestino
     */
    public String getUsuarioDestino() {
        return usuarioDestino;
    }

    /**
     * @param usuarioDestino the usuarioDestino to set
     */
    public void setUsuarioDestino(String usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    /**
     * @return String return the tipoTransaccion
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * @param tipoTransaccion the tipoTransaccion to set
     */
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    /**
     * @return String return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
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
     * @return String return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return Date return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}