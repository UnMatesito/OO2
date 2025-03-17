package oo2.ej2.parte1;

public class Tijeras implements Elemento {
    private String nombre;

    public Tijeras(){
        this.nombre = "Tijeras";
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Papel;
    }
}
