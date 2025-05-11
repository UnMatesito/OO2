package ej12;

import java.time.LocalDate;

public class Archivo extends Elemento{

    public Archivo(String nombre, LocalDate fechaCreacion, int tamañoBytes) {
        super(nombre, fechaCreacion, tamañoBytes);
    }

    @Override
    public boolean esIgual(String nombre) {
        return super.getNombre().equals(nombre);
    }
}
