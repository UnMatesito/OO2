package oo2.ej2.parte1;

public class Piedra implements Elemento {
    private String nombre;

    public Piedra(){
        this.nombre = "Piedra";
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Tijeras;
    }
}
