package oo2.ej2.parte1;

public class Papel implements Elemento {
    private String nombre;

    public Papel(){
        this.nombre = "Papel";
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean ganaA(Elemento contrincante){
        return contrincante instanceof Piedra;
    }
}
