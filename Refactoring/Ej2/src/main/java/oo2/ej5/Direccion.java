package oo2.ej5;

public class Direccion {
    private String localidad;
    private String calle;
    private String numero;
    private String departamento;

    public String getDireccionFormateada() {
        return this.localidad + "," + this.calle + "," + this.numero + "," + this.departamento;
    }
}
