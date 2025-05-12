package ej18;

import java.time.LocalDate;

public class FileOO2 implements Component{
    private String nombre;
    private String extension;
    private int tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;

    public FileOO2(String nombre, String extension, int tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public int getTamaño() {
        return tamaño;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public String getPermisos() {
        return permisos;
    }

    public String prettyPrint(){
        return "";
    }
}
