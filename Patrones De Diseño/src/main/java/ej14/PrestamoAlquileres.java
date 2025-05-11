package ej14;

import java.time.LocalDate;

public class PrestamoAlquileres extends Prestamo{
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoMensual;

    public PrestamoAlquileres(LocalDate fechaInicio, LocalDate fechaFin, double costoMensual) {
        super(0.9);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoMensual = costoMensual;
    }

    @Override
    public double calcularValor() {
        return mesesQueFaltan() * costoMensual;
    }

    private int mesesQueFaltan() {
        return fechaFin.getYear() * 12 + fechaFin.getMonthValue() - (LocalDate.now().getYear() * 12 + LocalDate.now().getMonthValue());
    }
}
