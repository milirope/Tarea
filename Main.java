
package com.mycompany.poo;

public class Main {
    
    public static void main(String[] args){
        
        Producto productoBase = new Producto("05-12-20", 30, "02-12-20", "Venezuela");
        Producto productoFresco = new ProductoFresco("05-12-20", 20, "02-12-17", "Colombia");
        Producto productoFrio = new ProductoFrio(-2,"05-12-20", 10, "02-10-19", "Argentina");
        Producto productoCAire = new CongeladoAire(2,3,4,5,-2,"05-12-20", 30, "02-11-24", "Peru");
        Producto productoCAgua = new CongeladoAgua(5,-2,"05-12-20", 10, "02-12-22", "Bolivia");
        Producto productoCNitrogeno = new CongeladoNitrogeno("Directo","6 min",-23,"05-12-20", 41, "02-12-24", "Ecuador");
        Producto productoRefrigerado = new ProductoRefrigerado("3",-23,"04-12-20", 40, "02-12-25", "Kanto");
        
        System.out.println("--------------------------");
        System.out.println("Producto Base");
        System.out.println(productoBase.getAtributos());
        System.out.println("--------------------------");
        System.out.println("Producto Fresco");
        System.out.println(productoFresco.getAtributos());
        System.out.println("--------------------------");        
        System.out.println("Producto Frio");
        System.out.println(productoFrio.getAtributos());
        System.out.println("--------------------------");
        System.out.println("Producto Con Aire");
        System.out.println(productoCAire.getAtributos());
        System.out.println("--------------------------");
        System.out.println("Producto Con Agua");
        System.out.println(productoCAgua.getAtributos());
        System.out.println("--------------------------");
        System.out.println("Producto Con Nitrogeno");
        System.out.println(productoCNitrogeno.getAtributos());
        System.out.println("--------------------------");
        System.out.println("Producto Refigerado");
        System.out.println(productoRefrigerado.getAtributos());
        System.out.println("--------------------------");
        
    }
    
}
