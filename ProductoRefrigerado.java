
package com.mycompany.poo;

public class ProductoRefrigerado extends ProductoFrio{
    
    private String codSupervision;

    public ProductoRefrigerado(String codSupervision, Number tempRecomendada, String fechaCaducidad, Number numeroLote, String fechaEnvasado, String paisOrigen) {
        super(tempRecomendada, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.codSupervision = codSupervision;
    }
    
    public String getCodSupervision() {
        return codSupervision;
    }

    public void setCodSupervision(String codSupervision) {
        this.codSupervision = codSupervision;
    }
    
    public String getAtributos(){
        return super.getAtributos() + 
                "\nCod Supervicion:" + codSupervision;
    }
}
