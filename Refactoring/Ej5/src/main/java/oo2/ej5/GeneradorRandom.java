package oo2.ej5;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GeneradorRandom implements TipoGenerador{
    @Override
    public String obtenerNumero(SortedSet<String> lineas) {
        String linea = new ArrayList<>(lineas)
                .get(new Random().nextInt(lineas.size()));
        lineas.remove(linea);
        return linea;
    }
}
