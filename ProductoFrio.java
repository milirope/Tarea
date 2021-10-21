
package com.mycompany.poo;

public class ProductoFrio extends Producto{

    private Number tempRecomendada;

    public ProductoFrio(Number tempRecomendada, String fechaCaducidad, Number numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.tempRecomendada = tempRecomendada;
    }

    public Number getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(Number tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
    
    public String getAtributos(){
        return super.getAtributos() + "\nTemperatura Recomendada:" + tempRecomendada;
    }
    
}
