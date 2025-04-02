package oo2.ej4;

public class SiesCuotas implements FormaPago{
    @Override
    public double sumarExtra(double costoProductos) {
        return costoProductos * 0.5;
    }
}
