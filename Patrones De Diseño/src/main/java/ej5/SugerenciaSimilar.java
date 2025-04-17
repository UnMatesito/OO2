package ej5;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilar implements Sugerencia{
    @Override
    public List<Pelicula> sugerir(Decodificador decodificador) {
        return decodificador.getPeliculasGrilla().stream()
                .flatMap(pelicula1 -> pelicula1.getPeliculasSimilares().stream())
                .flatMap(pelicula2 -> pelicula2.getPeliculasSimilares().stream())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
    }
}
