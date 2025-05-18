package oo2.ej5;

import java.util.SortedSet;

public class GeneradorUltimo implements TipoGenerador{
    @Override
    public String obtenerNumero(SortedSet<String> lineas) {
        String linea = lineas.last();
        lineas.remove(linea);
        return linea;
    }
}
