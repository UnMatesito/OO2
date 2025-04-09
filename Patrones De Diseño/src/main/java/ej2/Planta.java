package ej2;

public class Planta extends PersonalConInformacion {
    private int añosAntiguedad;

    public Planta(int cantidadHijos, boolean estaCasado, int añosAntiguedad) {
        super(cantidadHijos, estaCasado);
        this.añosAntiguedad = añosAntiguedad;
    }

    @Override
    protected double basico() {
        return 50000;
    }

    @Override
    protected double adicional(){
        return super.adicional() + (2000 * añosAntiguedad);
    }
}

