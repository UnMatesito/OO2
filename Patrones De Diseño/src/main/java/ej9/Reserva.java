package ej9;

import java.time.LocalDate;

public class Reserva {
    private int cantidadDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler auto;

    public Reserva(int cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto) {
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.conductor = conductor;
        this.auto = auto;
    }

    public double montoAPagar(){
        return this.auto.getPrecioPorDia() * this.cantidadDias;
    }

    public double montoARembolsar(LocalDate fechaCancelacion){
        return this.auto.calcularPolitica(this, fechaCancelacion);
    }


    public int getCantidadDias() {
        return cantidadDias;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getConductor() {
        return conductor;
    }

    public AutoEnAlquiler getAuto() {
        return auto;
    }
}
