
package com.mycompany.poo;

public class CongeladoNitrogeno extends ProductoFrio{
    
    private String metodoEmpleado;
    private String tiempoExposicion;

    public CongeladoNitrogeno(String metodoEmpleado, String tiempoExposicion, Number tempRecomendada, String fechaCaducidad, Number numeroLote, String fechaEnvasado, String paisOrigen) {
        super(tempRecomendada, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.metodoEmpleado = metodoEmpleado;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoEmpleado() {
        return metodoEmpleado;
    }

    public void setMetodoEmpleado(String metodoEmpleado) {
        this.metodoEmpleado = metodoEmpleado;
    }

    public String getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(String tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }
    
    public String getAtributos(){
        return super.getAtributos() + 
                "\nTiempo Exposicion:" + tiempoExposicion;
    }
}
