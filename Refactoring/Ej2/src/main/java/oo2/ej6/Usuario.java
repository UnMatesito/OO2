package oo2.ej6;

import java.util.List;

public class Usuario {
    private String nombre;
    private int telefono;
    private Suscripcion suscripcion;
    private String email;
    private List<Pelicula> peliculasCompradas;
    // ...

    public void setSuscripcion(Suscripcion unTipo) {
        this.suscripcion = unTipo;
    }

    public double calcularCostoPelicula(Pelicula pelicula) {
        return suscripcion.calcularCostoSegunSuscripcion(pelicula);
    }
}
