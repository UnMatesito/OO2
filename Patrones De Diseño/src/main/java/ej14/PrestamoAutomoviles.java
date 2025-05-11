package ej14;

import java.time.LocalDate;

public class PrestamoAutomoviles extends Prestamo{
    private int modelo;
    private double kilometraje;
    private double costo0KM;

    public PrestamoAutomoviles(int modelo, double kilometraje, double costo0KM) {
        super(0.7);
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0KM = costo0KM;
    }

    @Override
    public double calcularValor() {
        return costo0KM - (costo0KM * porcentajePorAntiguedad());
    }

    private double porcentajePorAntiguedad(){
        return 0.10 * getAntiguedad();
    }

    private int getAntiguedad(){
        return LocalDate.now().getYear() - this.modelo;
    }
}
