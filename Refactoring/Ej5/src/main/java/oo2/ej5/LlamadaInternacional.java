package oo2.ej5;

public class LlamadaInternacional implements TipoLlamada{
    @Override
    public double getPrecioLlamada() {
        return 150;
    }

    @Override
    public double getAdicional() {
        return 0;
    }
}
