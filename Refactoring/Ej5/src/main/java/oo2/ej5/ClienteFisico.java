package oo2.ej5;

public class ClienteFisico extends Cliente{
    private String dni;

    public ClienteFisico(String nombre, String numeroTelefono, String dni) {
        super(nombre, numeroTelefono);
        this.dni = dni;
    }

    @Override
    public void setId(String id) {
        this.dni = id;
    }

    @Override
    public String getId() {
        return this.dni;
    }

    @Override
    public double getDescuento() {
        return 0;
    }
}
