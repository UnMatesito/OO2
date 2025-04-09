package ej2;

public class Pasante extends Personal{
    private int examenesRendidos;

    public Pasante(int examenesRendidos){
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    protected double basico() {
        return 20000;
    }

    @Override
    protected double adicional() {
        return 2000 * examenesRendidos;
    }
}
