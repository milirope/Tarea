
package com.mycompany.poo;

public class CongeladoAgua extends ProductoFrio{
    
    private Number salinidadAgua;

    public CongeladoAgua(Number salinidadAgua, Number tempRecomendada, String fechaCaducidad, Number numeroLote, String fechaEnvasado, String paisOrigen) {
        super(tempRecomendada, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.salinidadAgua = salinidadAgua;
    }

    public Number getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(Number salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }
    
    public String getAtributos(){
        return super.getAtributos() + 
                "\nSalinidad Agua:" + salinidadAgua
        ;
    }
}
