package oo2.ej5;

public class Cliente {
    private Direccion direccion;

    public String getDireccion() {
        return this.direccion.getDireccionFormateada();
    }
}
