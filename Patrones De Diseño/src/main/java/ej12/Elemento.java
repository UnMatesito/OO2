package ej12;

import java.time.LocalDate;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion;
    private int tamañoBytes;

    public Elemento(String nombre, LocalDate fechaCreacion, int tamañoBytes) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.tamañoBytes = tamañoBytes;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public int getTamañoBytes() {
        return tamañoBytes;
    }

    public abstract boolean esIgual(String nombre);
}
