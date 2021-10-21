
package com.mycompany.poo;

public class Producto {
       
    
    private String fechaCaducidad;
    private Number numeroLote;
    private String fechaEnvasado;
    private String paisOrigen;
    
    Producto(String fechaCaducidad, Number numeroLote, String fechaEnvasado, String paisOrigen){
       this.fechaCaducidad = fechaCaducidad;
       this.numeroLote = numeroLote;
       this.fechaEnvasado = fechaEnvasado;
       this.paisOrigen = paisOrigen;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Number getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Float numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public String getAtributos(){
        return "Fecha Caducidad:" + fechaCaducidad +
               "\nFecha Envasado:" + fechaEnvasado +
               "\nNumero Lote:" + numeroLote +
               "\nPais Origen:" + paisOrigen;
    }
    
}
