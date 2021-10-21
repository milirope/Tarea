
package com.mycompany.poo;

public class CongeladoAire extends ProductoFrio{
    private Number nitrogeno;
    private Number oxigeno;
    private Number dioxCarbono;
    private Number vaporAgua;

    public CongeladoAire(Number nitrogeno, Number oxigeno, Number dioxCarbono, Number vaporAgua, Number tempRecomendada, String fechaCaducidad, Number numeroLote, String fechaEnvasado, String paisOrigen) {
        super(tempRecomendada, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxCarbono = dioxCarbono;
        this.vaporAgua = vaporAgua;
    }

    public Number getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(Number nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public Number getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(Number oxigeno) {
        this.oxigeno = oxigeno;
    }

    public Number getDioxCarbono() {
        return dioxCarbono;
    }

    public void setDioxCarbono(Number dioxCarbono) {
        this.dioxCarbono = dioxCarbono;
    }

    public Number getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(Number vaporAgua) {
        this.vaporAgua = vaporAgua;
    }
    
    public String getAtributos(){
        return super.getAtributos() + 
                "\nNitrogeno:" + nitrogeno +
                "\nOxigeno:" + oxigeno +
                "\nDioxCarbono:" + dioxCarbono +
                "\nVapor Agua:" + vaporAgua
        ;
    }
}
