package ej14;

import java.util.ArrayList;
import java.util.List;

public class PrestamoCombinado extends Prestamo {
    private List<Prestamo> prestamos;

    public PrestamoCombinado() {
        super(0.5);
        this.prestamos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    @Override
    public double calcularValor() {
        return prestamos.stream().mapToDouble(prestamo -> prestamo.calcularValor()).sum();
    }
}
