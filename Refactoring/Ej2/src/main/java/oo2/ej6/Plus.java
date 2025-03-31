package oo2.ej6;

public class Plus extends Suscripcion{
    public Plus() {
        super("Plus");
    }

    @Override
    public double calcularCostoSegunSuscripcion(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
