package ej2;

public abstract class PersonalConInformacion extends Personal{
    private int cantidadHijos;
    private boolean estaCasado;

    public PersonalConInformacion(int cantidadHijos, boolean estaCasado){
        this.cantidadHijos = cantidadHijos;
        this.estaCasado = estaCasado;
    }

    @Override
    protected abstract double basico();

    @Override
    protected double adicional(){
        if (this.estaCasado){
            return 5000 + (2000 * this.cantidadHijos);
        }
        return 2000 * this.cantidadHijos;
    }
}
