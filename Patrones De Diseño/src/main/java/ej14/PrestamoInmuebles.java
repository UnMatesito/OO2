package ej14;

public class PrestamoInmuebles extends Prestamo{
    private String direccion;
    private double superficie;
    private double costoMetrosCuadrados;

    public PrestamoInmuebles(String direccion, double superficie, double costoMetrosCuadrados) {
        super(0.2);
        this.direccion = direccion;
        this.superficie = superficie;
        this.costoMetrosCuadrados = costoMetrosCuadrados;
    }

    @Override
    public double calcularValor() {
        return superficie * costoMetrosCuadrados;
    }
}
