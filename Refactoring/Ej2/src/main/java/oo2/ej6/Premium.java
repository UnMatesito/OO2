package oo2.ej6;

public class Premium extends Suscripcion{
    public Premium(){
        super("Premium");
    }

    @Override
    public double calcularCostoSegunSuscripcion(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }
}
