package oo2.ej2.parte2;

import oo2.ej2.parte1.Elemento;

public class Papel implements Elemento {
    private String nombre;

    public Papel() {
        this.nombre = "Papel";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Piedra || contrincante instanceof Spock;
    }
}
