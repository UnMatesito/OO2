package ej5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNueva implements Sugerencia{
    @Override
    public List<Pelicula> sugerir(Decodificador decodificador) {
        return decodificador.getPeliculasGrilla().stream()
                .sorted(Comparator.comparingInt(Pelicula::getAñoEstreno).reversed())
                .filter(pelicula -> !decodificador.getPeliculasVistas().contains(pelicula))
                .limit(3)
                .collect(Collectors.toList());
    }
}
