package oo2.ej5;

public class LlamadaNacional implements TipoLlamada{
    @Override
    public double getPrecioLlamada() {
        return 3;
    }

    @Override
    public double getAdicional() {
        return 50;
    }
}
