package ej2;

public class Temporario extends PersonalConInformacion{
    private int cantidadHoras;

    public Temporario(int cantidadHijos, boolean estaCasado, int cantidadHoras){
        super(cantidadHijos, estaCasado);
        this.cantidadHoras = cantidadHoras;
    }

    @Override
    protected double basico() {
        return 20000 + (cantidadHoras * 300);
    }
}
