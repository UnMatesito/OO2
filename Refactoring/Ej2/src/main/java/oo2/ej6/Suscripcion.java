package oo2.ej6;

public abstract class Suscripcion {
    private String nombrePlan;

    public Suscripcion(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public abstract double calcularCostoSegunSuscripcion(Pelicula pelicula);
}
