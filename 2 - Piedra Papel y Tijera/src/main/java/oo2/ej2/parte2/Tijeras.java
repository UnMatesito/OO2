package oo2.ej2.parte2;

import oo2.ej2.parte1.Elemento;

public class Tijeras implements Elemento {
    private String nombre;

    public Tijeras() {
        this.nombre = "Tijeras";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Papel || contrincante instanceof Lagarto;
    }
}
