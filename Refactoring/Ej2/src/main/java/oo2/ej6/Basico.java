package oo2.ej6;

public class Basico extends Suscripcion{
    public Basico() {
        super("Basico");
    }

    @Override
    public double calcularCostoSegunSuscripcion(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
    }
}
