package ej5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecodificadorTest {
    private Decodificador deco;
    private Pelicula pelicula1;
    private Pelicula pelicula2;
    private Pelicula pelicula3;
    private Pelicula pelicula4;
    private Pelicula pelicula5;
    private Pelicula pelicula6;

    @BeforeEach
    void setUp() {
        ArrayList<Pelicula> peliculasSimilares = new ArrayList<>();
        peliculasSimilares.add(pelicula2);
        peliculasSimilares.add(pelicula3);
        pelicula1= new Pelicula("Thor", 2007, peliculasSimilares, 7.9);

        peliculasSimilares.clear();
        peliculasSimilares.add(pelicula1);
        peliculasSimilares.add(pelicula3);
        pelicula2= new Pelicula("Capitan America", 2016, peliculasSimilares, 7.8);

        peliculasSimilares.clear();
        peliculasSimilares.add(pelicula1);
        peliculasSimilares.add(pelicula2);
        pelicula3= new Pelicula("Iron Man", 2010, peliculasSimilares, 7.9);

        peliculasSimilares.clear();
        pelicula4= new Pelicula("Dunkirk", 2017, new ArrayList<Pelicula>(), 7.9);

        peliculasSimilares.add(pelicula6);
        pelicula5= new Pelicula("Rocky", 1976, peliculasSimilares, 8.1);

        peliculasSimilares.clear();
        peliculasSimilares.add(pelicula5);
        pelicula6= new Pelicula("Rambo", 1979, peliculasSimilares, 7.8);

        ArrayList<Pelicula> peliculasGrilla = new ArrayList<>();
        peliculasGrilla.add(pelicula1);
        peliculasGrilla.add(pelicula2);
        peliculasGrilla.add(pelicula3);
        peliculasGrilla.add(pelicula4);
        peliculasGrilla.add(pelicula5);
        peliculasGrilla.add(pelicula6);

        SugerenciaSimilar sugerenciaSimilar = new SugerenciaSimilar();

        deco = new Decodificador(peliculasGrilla, sugerenciaSimilar);
        deco.addPeliculaVista(pelicula1);
        deco.addPeliculaVista(pelicula5);
    }

    @Test
    void testSugerenciasSimilares(){
        ArrayList<Pelicula> peliculasSimilares = new ArrayList<>();
        peliculasSimilares.add(pelicula2);
        peliculasSimilares.add(pelicula3);
        peliculasSimilares.add(pelicula6);
        assertTrue(deco.buscarSugerencias().containsAll(peliculasSimilares));
    }

    @Test
    void testSugerenciasPuntaje(){
        SugerenciaPuntaje sugerenciaPuntaje = new SugerenciaPuntaje();
        deco.cambiarSugerencia(sugerenciaPuntaje);
        ArrayList<Pelicula> peliculasSimilares = new ArrayList<>();
        peliculasSimilares.add(pelicula4);
        peliculasSimilares.add(pelicula3);
        peliculasSimilares.add(pelicula2);
        assertTrue(deco.buscarSugerencias().containsAll(peliculasSimilares));
    }
}
