package oo2.ej5;

public class ClienteJuridico extends Cliente{
    private String cuit;

    public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
        super(nombre, numeroTelefono);
        this.cuit = cuit;
    }

    @Override
    public void setId(String id) {
        this.cuit = id;
    }

    @Override
    public String getId() {
        return this.cuit;
    }

    @Override
    public double getDescuento() {
        return 0.15;
    }
}
