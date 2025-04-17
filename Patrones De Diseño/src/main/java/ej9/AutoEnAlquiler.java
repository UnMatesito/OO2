package ej9;

import java.time.LocalDate;

public class AutoEnAlquiler {
    private double precioPorDia;
    private int cantidadPlazas;
    private String marca;
    private PoliticaCancelacion politica;

    public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca, PoliticaCancelacion politica) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
        this.politica = politica;
    }

    public PoliticaCancelacion getPolitica() {
        return politica;
    }

    public double calcularPolitica(Reserva reserva, LocalDate fechaCancelacion){
        return politica.calcularPoliticaCancelacion(reserva, fechaCancelacion);
    }

    public void setPolitica(PoliticaCancelacion politica) {
        this.politica = politica;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public int getCantidadPlazas() {
        return cantidadPlazas;
    }

    public String getMarca() {
        return marca;
    }
}
