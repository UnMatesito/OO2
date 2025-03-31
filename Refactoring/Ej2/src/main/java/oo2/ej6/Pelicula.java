package oo2.ej6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
    private String nombre;
    private String genero;
    private LocalDate fechaEstreno;
    private double costo;
    // ...

    public double getCosto() {
        return this.costo;
    }

    public double calcularCargoExtraPorEstreno(){
        return estrenada30DiasAntes();
    }

    private int estrenada30DiasAntes() {
        return seEstreno30DiasAntes() ? 0 : 300;
    }

    private boolean seEstreno30DiasAntes() {
        return ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) > 30;
    }
}
