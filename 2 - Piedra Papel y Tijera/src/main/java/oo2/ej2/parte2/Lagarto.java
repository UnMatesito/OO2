package oo2.ej2.parte2;

import oo2.ej2.parte1.Elemento;

public class Lagarto implements Elemento {
    private String nombre;

    public Lagarto(){
        this.nombre = "Lagarto";
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Spock || contrincante instanceof Papel;
    }
}
