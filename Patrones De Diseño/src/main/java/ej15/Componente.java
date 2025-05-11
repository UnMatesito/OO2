package ej15;

public class Componente {
    private String nombre;
    private String descripcion;
    private double precio;
    private double consumo;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getConsumo() {
        return consumo;
    }

    public boolean mismaDescripcion(String descripcion){
        return this.descripcion.equals(descripcion);
    }
}
