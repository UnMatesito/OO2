package oo2.ej2.parte2;

import oo2.ej2.parte1.Elemento;

public class Piedra implements Elemento {
    private String nombre;

    public Piedra() {
        this.nombre = "Piedra";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Tijeras || contrincante instanceof Lagarto;
    }
}
