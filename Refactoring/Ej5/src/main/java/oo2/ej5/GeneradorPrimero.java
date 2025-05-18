package oo2.ej5;

import java.util.SortedSet;

public class GeneradorPrimero implements TipoGenerador{
    @Override
    public String obtenerNumero(SortedSet<String> lineas) {
        String linea = lineas.first();
        lineas.remove(linea);
        return linea;
    }
}
