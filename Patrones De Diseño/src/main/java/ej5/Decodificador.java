package ej5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> peliculasGrilla;
    private List<Pelicula> peliculasVistas;
    private Sugerencia sugerencia;

    public Decodificador(List<Pelicula> peliculasGrilla, Sugerencia sugerencia) {
        this.peliculasVistas = new ArrayList<>();
        this.peliculasGrilla = peliculasGrilla;
        this.sugerencia = sugerencia;
    }

    public void addPeliculaVista(Pelicula peliculaVista){
        this.peliculasVistas.add(peliculaVista);
    }

    public void addPeliculaGrilla(Pelicula pelicula){
        this.peliculasGrilla.add(pelicula);
    }

    public void cambiarSugerencia(Sugerencia sugerencia){
        this.sugerencia = sugerencia;
    }

    public List<Pelicula> getPeliculasGrilla() {
        return new ArrayList<>(peliculasGrilla);
    }

    public List<Pelicula> getPeliculasVistas() {
        return new ArrayList<>(peliculasVistas);
    }

    public Sugerencia getSugerencia() {
        return sugerencia;
    }

    public List<Pelicula> buscarSugerencias(){
        return this.sugerencia.sugerir(this);
    }
}
