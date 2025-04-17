package ej5;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int añoEstreno;
    private List<Pelicula> peliculasSimilares;
    private double puntaje;

    public Pelicula(String titulo, int añoEstreno, List<Pelicula> peliculasSimilares, double puntaje) {
        this.titulo = titulo;
        this.añoEstreno = añoEstreno;
        this.peliculasSimilares = peliculasSimilares;
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public List<Pelicula> getPeliculasSimilares() {
        return new ArrayList<>(peliculasSimilares);
    }

    public double getPuntaje() {
        return puntaje;
    }
}
