package oo2.ej6;

public class Familia extends Suscripcion{
    public Familia() {
        super("Familia");
    }

    @Override
    public double calcularCostoSegunSuscripcion(Pelicula pelicula) {
        return (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
    }
}
