package oo2.ej2.parte2;

import oo2.ej2.parte1.Elemento;

public class Spock implements Elemento {
    private String nombre;

    public Spock(){
        this.nombre = "Spock";
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Tijeras || contrincante instanceof Piedra;
    }
}
